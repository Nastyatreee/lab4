package ru.mirea.lab19.task2;

public class LabClassDriver {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Орлова Анастасия Игоревна", 4.7);
        students[1] = new Student("Никитина Алина Павловна", 3.8);
        students[2] = new Student("Титова Вера Олеговна", 4.2);
        students[3] = new Student("Фёдорова Дарья Ильинична", 4.9);

        LabClassUI ui = new LabClassUI(new LabClass(students));
        ui.start();
    }
}
