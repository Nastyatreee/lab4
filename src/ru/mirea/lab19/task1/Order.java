package ru.mirea.lab19.task1;

import java.util.Scanner;

public class Order {
    private static String[] clients = {"Орлова Анна Сергеевна", "Белов Игорь Петрович", "Зайцева Мария Ивановна"};
    private static String[] inns = {"770123456789", "500987654321", "381234567890"};

    public static void checkInn(String fio, String inn) throws InvalidInnException {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].equalsIgnoreCase(fio)) {
                if (inns[i].equals(inn)) {
                    return;
                }
                throw new InvalidInnException("ИНН " + inn + " не принадлежит клиенту " + fio);
            }
        }
        throw new InvalidInnException("Клиент " + fio + " не найден, ИНН проверить нельзя");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = sc.nextLine().trim();
        System.out.print("Введите ИНН: ");
        String inn = sc.nextLine().trim();

        try {
            checkInn(fio, inn);
            System.out.println("ИНН верный. Покупка оформлена!");
        } catch (InvalidInnException e) {
            System.out.println("Недействительный ИНН: " + e.getMessage());
        }
    }
}
