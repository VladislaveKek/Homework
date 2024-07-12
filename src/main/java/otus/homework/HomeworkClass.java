package otus.homework;

import java.util.Scanner;

public class HomeworkClass {
    public static void main(String[] args) {
        System.out.println("С чего начнем?");
        System.out.println("1. Выбор персонажа!");
        System.out.println("2. Выбор характеристик!");
        System.out.println("3. В бой!");
        System.out.println("4. compareNumbers");
        System.out.println("5. addOrSubtractAndPrint");

        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        if (menu == 1) {
            greetings();
        }
        else if (menu == 2) {
            checkSign();
        }
        else if (menu == 3) {
            selectorColor();
        }
        else if (menu == 4) {
            System.out.println("Введите переменную a");
            int a = scanner.nextInt();
            System.out.println("Введите переменную b");
            int b = scanner.nextInt();
            compareNumbers(a,b);
        }
        else if (menu == 5) {
            System.out.println("Введите число");
            int initValue = scanner.nextInt();
            System.out.println("Введите это число повторно");
            int delta = scanner.nextInt();
            if (initValue == delta) {boolean increment = true;
                addOrSubtractAndPrint(initValue, delta, increment);
            }
            if (initValue != delta) {boolean increment = false;
                addOrSubtractAndPrint(initValue, delta, increment);
            }
        }
        else {
            System.out.println("От 1 до 5, как пальцев на руке");
        }
    }
    public static void greetings() {
        System.out.println("Кто ты?");
        System.out.println("1. ГОРК!");
        System.out.println("2. МОРК!");
        System.out.println("3. WAAAAGH!");
        System.out.println("4. HackerMan!");

        Scanner scanner = new Scanner(System.in);
        int character = scanner.nextInt();
        if (character == 1) {
            System.out.println("ЗА ГОРКА!"); }
        else if (character == 2) {
            System.out.println("ЗА МОРКА!"); }
        else if (character == 3) {
            System.out.println("WAAAAAAAAGH!!!");}
        else if (character == 4) {
            System.out.println("Бей его ребята!"); }
        else {
            System.out.println("you died"); }
        checkSign();
    }
    public static void checkSign() {
        System.out.println("Сколько у тебя очков силы?");
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        System.out.println("Сколько у тебя очков интеллекта?");
        int intelligence = scanner.nextInt();
        System.out.println("А сколько у тебя жубов?");
        int jubs = scanner.nextInt();
        int result = power + intelligence + jubs;
        System.out.print("Твой рейтинг в орде = ");
        System.out.println(result);
        if (result >= 0) {
            System.out.println("Ты настоящий орк!"); }
        if (result < 0) {
            System.out.println("Человечешка! Бей его ребята!"); }
        selectorColor();
    }
    public static void selectorColor() {
        int enemies = (int) (Math.random() * 100);
        System.out.print("Ты победил ");
        System.out.print(enemies);
        System.out.println(" человешек!");
        if (enemies <= 30) {
            System.out.println("Это мало"); }
        if (enemies > 30 && enemies <= 60) {
            System.out.println("Это средне"); }
        if (enemies > 60) {
            System.out.println("Это много!"); }
    }
    public static void compareNumbers(int a, int b) {
        System.out.println("Переменная а = " + a);
        System.out.println("Переменная b = " + b);
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println("Вы ввели одинаковые числа! " + (initValue+delta));
        }
        else {
            System.out.println("Вы ввели разные числа! " + (initValue-delta));
        }
    }
}