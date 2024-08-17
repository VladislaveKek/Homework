package otus.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Какого размера ваш двумерный массив?\n" +
                "Введите кол-во строк");

        while (!scanner.hasNextInt()) {
            System.out.println("Введи целое число");
            scanner.next();
        }
        int size1 = scanner.nextInt();
        System.out.println("\n" +
                "Отлично! У вас будет " + size1 + " строк!\n" +
                "А теперь введите кол-во столбцов");

        while (!scanner.hasNextInt()) {
            System.out.println("Введи целое число");
            scanner.next();
        }
        int size2 = scanner.nextInt();

        System.out.println("\n" +
                "У тебя будет " + size2 + " столбцов\n" +
                "Вот как это выглядит:");

        int[][] massiveX2URL = new int[size1][size2];
        for (int i = 0; i < massiveX2URL.length; i++) {
            for (int j = 0; j < massiveX2URL[i].length; j++) {
                System.out.print(massiveX2URL[i][j] + " ");
            }
            System.out.println();
        }
        sumOfPositive(massiveX2URL);
    }

    public static void sumOfPositive(int[][] massiveX2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Давай заполним таблицу значениями\n" +
                "Хочешь заполнить вручную или рандомно?\n" +
                "1. Вручную\n" +
                "2. Рандомно");

        while (!scanner.hasNextInt()) {
            System.out.println("Выбери вариант введя число");
            scanner.next();
        }
        int menu = scanner.nextInt();
        if (menu == 1) {
            System.out.println("\n" +
                    "Вручную? Бог тебе судья");

            for (int i = 0; i < massiveX2.length; i++) {
                for (int j = 0; j < massiveX2[i].length; j++) {
                    System.out.println("Введи число (осталось заполнить " + (massiveX2[i].length - j) + " значений в строке)");
                    int value = scanner.nextInt();
                    massiveX2[i][j] = value;
                }
                System.out.println("Вот что ты заполнил");
                for (int j = 0; j < massiveX2[i].length; j++) {
                    System.out.print(massiveX2[i][j] + " ");
                }
                System.out.println();
                System.out.println("\n" +
                        "Строка " + (i + 1) + " заполнена (осталось заполнить " + (massiveX2.length - 1 - i) + " строки)");
            }
        } else if (menu == 2) {
            System.out.println("Разумный выбор");
            Random random = new Random();
            int max = 10;
            int min = -10;
            for (int i = 0; i < massiveX2.length; i++) {
                for (int j = 0; j < massiveX2[i].length; j++) {
                    int value = random.nextInt(20 + 1) - 10;
                    massiveX2[i][j] = value;
                }
            }
            System.out.println("Вооот такая у нас в итоге получилась таблица:");
            for (int i = 0; i < massiveX2.length; i++) {
                for (int j = 0; j < massiveX2[i].length; j++) {
                    System.out.print(massiveX2[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            sumOfPositive(massiveX2);
        }
        int sum = 0;
        for (int i = 0; i < massiveX2.length; i++) {
            for (int j = 0; j < massiveX2[i].length; j++) {
                if (massiveX2[i][j] > 0) {
                    sum += massiveX2[i][j];
                }
            }
        }
        System.out.println("\n" +
                "Сумма положительных чисел в массиве = " + sum);
    }
}