package ru.mirea.lab19.task2;

import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    private Scanner sc = new Scanner(System.in);

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    public void start() {
        boolean work = true;
        while (work) {
            System.out.println();
            System.out.println("1 - список студентов");
            System.out.println("2 - сортировка по среднему баллу");
            System.out.println("3 - поиск по ФИО");
            System.out.println("0 - выход");
            System.out.print("Выберите пункт: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    labClass.printAll();
                    break;
                case 2:
                    labClass.sortByScore();
                    labClass.printAll();
                    break;
                case 3:
                    search();
                    break;
                case 0:
                    work = false;
                    break;
                default:
                    System.out.println("Нет такого пункта");
            }
        }
    }

    private void search() {
        System.out.print("Введите ФИО: ");
        String fio = sc.nextLine().trim();
        try {
            System.out.println("Найдено: " + labClass.findByFio(fio));
        } catch (EmptyStringException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
