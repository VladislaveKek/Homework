package otus.homework;

import java.util.Scanner;

public class HomeworkClass {
    public static void main (String[] args) {
        System.out.println("С чего начнем?");
        System.out.println("1. Выбор персонажа!");
        System.out.println("2. Выбор характеристик!");

        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        if (menu == 1) { greetings();}
        if (menu == 2) { checkSign();}

    }
    public static void greetings (){
        System.out.println("Кто ты?");
        System.out.println("1. ГОРК!");
        System.out.println("2. МОРК!");
        System.out.println("3. WAAAAGH!");
        System.out.println("4. HackerMan!");
        Scanner scanner = new Scanner(System.in);
        int character = scanner.nextInt();
        if (character == 1) {
            System.out.println("ЗА ГОРКА!");
        } else if (character == 2) {
            System.out.println("ЗА МОРКА!");
        } else if (character == 3) {
            System.out.println("WAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGH");
        } else if (character == 4) {
            System.out.println("Бей его ребята!");
        } else {
            System.out.println("Попробуй еще раз");
        }
    }
    public static void checkSign (){
        System.out.println("Сколько у тебя очков силы?");
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        System.out.println("Сколько у тебя очков интеллекта?");
        int intelligence = scanner.nextInt();
        System.out.println("А сколько у тебя жубов?");
        int jubs = scanner.nextInt();
        int result = power+intelligence+jubs;
        System.out.print("Твой рейтинг в орде = " );
        System.out.println(result);
        if (result >=0) {
            System.out.println("Ты настоящий орк!");
        }
        if (result < 0) {
            System.out.println("Гретчин!");
        }
    }
}