package otus.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        System.out.println("Какой метод желаете вызвать?\n" +
                "1. Метод принимающий число и строку\n" +
                "2. Метод принимающий массив\n" +
                "3. Метод принимающий число и ссылку\n" +
                "4. Метод принимающий число и ссылку ++\n" +
                "5. Метод принимающий массив и выдающий > половину массива\n" +
                "6. Метод принимающий два массива и образующий третий*");
        Scanner scannerMenu = new Scanner(System.in);
        int menu = scannerMenu.nextInt();

        // здесь начинается заполнение аргументов первого метода
        if (menu == 1) {
            System.out.println("Укажите номер вашего гендера");
            Scanner scannerValue = new Scanner(System.in);
            while (!scannerValue.hasNextInt()) {
                System.out.println("Это фиаско, попробуй еще раз");
                scannerValue.next();
            }
            int a1 = scannerValue.nextInt();
            System.out.println("Кем вы себя идентифицируете?");
            Scanner scannerText = new Scanner(System.in);
            while (scannerText.hasNextInt()) {
                System.out.println("Это фиаско, попробуй еще раз");
                scannerText.next();
            }
            String text = scannerText.next();
            theFirstExercise(a1, text);

            // здесь начинается заполнение аргументов второго метода
        } else if (menu == 2) {
            int[] massiveURL1 = new int[3];
            while (massiveURL1[massiveURL1.length - 1] == 0) {
                if (massiveURL1[0] == 0) {
                    System.out.println("Чему равен ваш IQ?");
                } else if (massiveURL1[0] > 0 && massiveURL1[massiveURL1.length - 2] <= 0) {
                    System.out.println("Нет, правда");
                } else {
                    System.out.println("Ладно, теперь серьезно");
                }
                Scanner scannerIQ = new Scanner(System.in);
                int IQ = scannerIQ.nextInt();
                for (int i = 0; i < massiveURL1.length; i++) {
                    if (massiveURL1[i] == 0) {
                        massiveURL1[i] = IQ;
//                        System.out.println(Arrays.toString(massiveURL));
                        break;
                    }
                }
            }
            theSecondExercise(massiveURL1);

            // здесь начинается заполнение аргументов третьего метода
        } else if (menu == 3) {
            System.out.println("Сколько нужно hundred bucks?");
            Scanner scannerInt = new Scanner(System.in);
            int a3 = scannerInt.nextInt();
            int[] massiveURL3 = new int[3];
            theThirdExercise(a3, massiveURL3);

            // здесь начинается заполнение аргументов четвертого метода
        } else if (menu == 4) {
            System.out.println("Какого размера ваш массив?");
            Scanner scannerInt = new Scanner(System.in);
            int size = scannerInt.nextInt();
            int[] massiveURL4 = new int[size];
            System.out.println(Arrays.toString(massiveURL4));
            System.out.println("На сколько вы хотите увеличить свой массив?");
            int a4 = scannerInt.nextInt();
            theFourthExercise(a4, massiveURL4);

            // здесь начинается заполнение аргументов пятого метода
        } else if (menu == 5) {
            int[] massiveURL5 = new int[6];
            System.out.println(Arrays.toString(massiveURL5));
            System.out.println("Заполните массив случайными числами, последнее число не должно быть 0");
            Scanner scanner = new Scanner(System.in);
            while (massiveURL5[massiveURL5.length - 1] == 0)
                for (int i = 0; i < massiveURL5.length; i++) {
                    if (massiveURL5[i] == 0) {
                        massiveURL5[i] = scanner.nextInt();
                        System.out.println(Arrays.toString(massiveURL5));
                        break;
                    }
                }
            theFifthExercise(massiveURL5);

            // здесь начинается заполнене аргументов одного задания со звездочкой
        } else if (menu == 6) {
            int[] starURL1 = {-5, 1, 10};
            float[] starURL2 = {15.5f, 18.6f, -21.1f};
            System.out.println("Есть два массива\n" +
                    "На одном числа точные" + Arrays.toString(starURL1) + "\n" +
                    "На другом числа дробные" + Arrays.toString(starURL2));
            starExercise(starURL1, starURL2);
        } else {
            System.out.println("Game Over");
        }
    }

    // здесь начинается первый метод
    public static void theFirstExercise(int a, String text) {
        for (int i = 0; i < a; i++) {
            System.out.println("Ржомба " + text + " xD");
        }
    }

    // здесь начинается второй метод
    public static void theSecondExercise(int[] massiveTheSecond) {
        int sum = 0;
        int mus;
        int cal = 0;
        for (int i = 0; i < massiveTheSecond.length; i++) {
            if (massiveTheSecond[i] >= 5) {
                mus = massiveTheSecond[i];
                sum = mus + sum;
                cal++;
            }
        }
        System.out.println("Поздравляю! Ваш средний IQ = " + sum / cal);
    }

    // здесь начинается третий метод
    public static void theThirdExercise(int a3, int[] massiveTheThird) {
        for (int i = 0; i < massiveTheThird.length; i++) {
            if (massiveTheThird[i] == 0) {
                massiveTheThird[i] = a3 * 100;
            }
        }
        System.out.println(Arrays.toString(massiveTheThird));
    }

    // здесь начинется четвертый метод
    public static void theFourthExercise(int a4, int[] massiveTheFourth) {
        for (int i = 0; i < massiveTheFourth.length; i++) {
            massiveTheFourth[i] = massiveTheFourth[i] + a4;
        }
        System.out.println(Arrays.toString(massiveTheFourth));
    }

    // здесь начинается пятый метод
    public static void theFifthExercise(int[] massiveTheFifth) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < massiveTheFifth.length / 2; i++) {
            left = left + massiveTheFifth[i];
        }
        for (int i = massiveTheFifth.length / 2; i < massiveTheFifth.length; i++) {
            right = right + massiveTheFifth[i];
        }
        if (left > right) {
            System.out.println("Сумма левой половины больше и = " + left);
        } else if (left < right) {
            System.out.println("Сумма правой половины больше и = " + right);
        } else {
            System.out.println("Суммы левой и правой половин одинаковы!");
        }
    }

    // здесь одно задание со звездочкой
    public static void starExercise(int[] massiveStar1, float[] massiveStar2) {
        float[] sumStarMassive = new float[3];
        for (int i = 0; i < sumStarMassive.length; i++) {
            if (sumStarMassive[i] == 0) {
                sumStarMassive[i] = massiveStar1[i] + massiveStar2[i];
            }
        }
        System.out.println("\nЗначения третьего массива равны сумме значений из двух предыдущих\n" +
                Arrays.toString(sumStarMassive));
    }
}