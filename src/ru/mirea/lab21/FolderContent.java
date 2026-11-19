package ru.mirea.lab21;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FolderContent {
    public static ArrayList<String> getContent(String path) {
        ArrayList<String> result = new ArrayList<>();
        File[] files = new File(path).listFiles();
        if (files == null) {
            return result;
        }
        for (File f : files) {
            if (f.isDirectory()) {
                result.add("[папка] " + f.getName());
            } else {
                result.add("[файл] " + f.getName());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Путь к каталогу: ");
        String path = sc.nextLine();

        ArrayList<String> content = getContent(path);
        if (content.isEmpty()) {
            System.out.println("Каталог пуст или не существует");
            return;
        }
        int count = Math.min(5, content.size());
        for (int i = 0; i < count; i++) {
            System.out.println(content.get(i));
        }
    }
}
