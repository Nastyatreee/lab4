package ru.mirea.lab19.task2;

public class LabClass {
    private Student[] students;

    public LabClass(Student[] students) {
        this.students = students;
    }

    public static void selectionSort(Comparable[] list) {
        for (int index = 0; index < list.length - 1; index++) {
            int min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }
            Comparable temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public void sortByScore() {
        selectionSort(students);
    }

    public Student findByFio(String fio) throws EmptyStringException, StudentNotFoundException {
        if (fio.isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }
        for (Student s : students) {
            if (s.getFio().equalsIgnoreCase(fio)) {
                return s;
            }
        }
        throw new StudentNotFoundException("Студента с ФИО «" + fio + "» нет в списке");
    }

    public void printAll() {
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }
}
