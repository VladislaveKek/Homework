package otus.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeworkClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую часть задания запустить?\n" +
                "1. Сложить положительные элементы массива\n" +
                "2. Построить квадрат в соответствии с размером массива\n" +
                "3. Зануление диагонали\n" +
                "4. Возвращение наибольшего элемента массива\n" +
                "5. Сумма элементов второй строки массива или -1");

        int menu = scanner.nextInt();
        if (menu == 1) {
            preOneQuest();
        } else if (menu == 2) {
            preTwoQuest();
        } else if (menu == 3) {
            preThreeQuest();
        } else if (menu == 4) {
            preFourQuest();
        } else if (menu == 5) {
            preFiveQuest();
        } else {
            System.out.println("Это фиаско");
        }
    }

    //здесь начинается заполнение аргементов для первого квеста
    public static void preOneQuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Какого размера ваш двумерный массив?\n" +
                "Введите кол-во строк");
        // здесь начинается проверка на дурака
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

    //здесь начинается заполнение аргументов для второго квеста
    public static void preTwoQuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Какого размера ваш квадрат?");
        // здесь начинается проверка на дурака
        while (!scanner.hasNextInt()) {
            System.out.println("Введи целое число");
            scanner.next();
        }
        int size1 = scanner.nextInt();

        char[][] quadrat = new char[size1][size1];

        for (int i = 0; i < quadrat.length; i++) {
            quadrat[i][0] = '*';
            quadrat[i][quadrat.length - 1] = '*';
            quadrat[0][i] = '*';
            quadrat[quadrat.length - 1][i] = '*';

        }
        for (int i = 0; i < quadrat.length; i++) {
            for (int j = 0; j < quadrat[i].length; j++) {
                System.out.print(quadrat[i][j] + " ");
            }
            System.out.println();
        }
    }

    //здесь начинается заполнение аргументов для третьего квеста
    public static void preThreeQuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Какого размера ваш массив?");
        // здесь начинается проверка на дурака
        while (!scanner.hasNextInt()) {
            System.out.println("Введи целое число");
            scanner.next();
        }
        int size1 = scanner.nextInt();

        char[][] massiveX2URL = new char[size1][size1];
        for (int i = 0; i < massiveX2URL.length; i++) {
            for (int j = 0; j < massiveX2URL[i].length; j++) {
                System.out.print(massiveX2URL[i][j] + " ");
            }
            System.out.println();
        }
        threeQuest(massiveX2URL);
    }

    public static void threeQuest(char[][] massiveX2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как провести диагональ?\n" +
                "1. Слева направо\n" +
                "2. Справа налево");
        int menu = scanner.nextInt();
        if (menu == 1) {
            for (int i = 0; i < massiveX2.length; i++) {
                massiveX2[i][i] = '0';
            }
            for (int i = 0; i < massiveX2.length; i++) {
                for (int j = 0; j < massiveX2[i].length; j++) {
                    System.out.print(massiveX2[i][j] + " ");
                }
                System.out.println();
            }
        } else if (menu == 2) {
            for (int i = 0; i < massiveX2.length; i++) {
                massiveX2[i][massiveX2.length - 1 - i] = '0';
            }
            for (int i = 0; i < massiveX2.length; i++) {
                for (int j = 0; j < massiveX2[i].length; j++) {
                    System.out.print(massiveX2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    //здесь начинается заполнение аргументов четвертого квеста
    public static void preFourQuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Какого размера ваш двумерный массив?\n" +
                "Введите кол-во строк");
        // здесь начинается проверка на дурака
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

        int[][] massiveX2 = new int[size1][size2];
        for (int i = 0; i < massiveX2.length; i++) {
            for (int j = 0; j < massiveX2[i].length; j++) {
                System.out.print(massiveX2[i][j] + " ");
            }
            System.out.println();
        }
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
        }
        int maximumPower = -2147483648;
        for (int i = 0; i < massiveX2.length; i++) {
            for (int j = 0; j < massiveX2[i].length; j++) {
                if (massiveX2[i][j] > maximumPower) {
                    maximumPower = massiveX2[i][j];
                }
            }
        }
        System.out.println("\n" +
                "Наибольшее число в массиве = " + maximumPower);
    }

    //здесь начинается заполнение аргументов 5 квеста
    public static void preFiveQuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Какого размера ваш двумерный массив?\n" +
                "Введите кол-во строк");
        // здесь начинается проверка на дурака
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

        int[][] massiveX2 = new int[size1][size2];
        Random random = new Random();
        int max = 10;
        int min = -10;
        for (int i = 0; i < massiveX2.length; i++) {
            for (int j = 0; j < massiveX2[i].length; j++) {
                int value = random.nextInt(20 + 1) - 10;
                massiveX2[i][j] = value;
            }
        }
        int sum = 0;
        for (int i = 0; i < massiveX2.length; i++) {
            for (int j = 0; j < massiveX2[i].length; j++) {
                System.out.print(massiveX2[i][j] + " ");
            }
            System.out.println();
            if (i == 1) {
                for (int j = 0; j < massiveX2[i].length; j++) {
                    sum += massiveX2[i][j];
                }
            }
        }
        if (sum != 0) {
            System.out.println("Сумма элементов второй строки = " + sum);
        } else {
            System.out.println("Второй строки нет :( -1");
        }
    }
}