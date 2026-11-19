package ru.mirea.lab19.task2;

public class Student implements Comparable<Student> {
    private String fio;
    private double averageScore;

    public Student(String fio, double averageScore) {
        this.fio = fio;
        this.averageScore = averageScore;
    }

    public String getFio() {
        return fio;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public int compareTo(Student other) {
        if (this.averageScore > other.averageScore) {
            return -1;
        } else if (this.averageScore < other.averageScore) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return fio + " — средний балл " + averageScore;
    }
}
