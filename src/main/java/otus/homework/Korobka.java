package otus.homework;

public class Korobka {

    //объявленные поля
    private String color;
    private int size;
    private boolean thisOpen;
    private String predmet;
    //объявленные поля//объявленные поля

    //геттеры
    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void getThisOpen() {
        if (thisOpen == true) {
            System.out.println("открыта");
        } else {
            System.out.println("закрыта");
        }
    }

    public String getPredmet() {
        return predmet;
    }
    //геттеры//геттеры

    //сеттеры
    public void setColor(String color) {
        this.color = color;
    }

    public void setThisOpen(boolean thisOpen) {
        this.thisOpen = thisOpen;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
    //сеттеры//сеттеры

    //конструкторы
    public Korobka() {
        color = "коричневый";
        size = 1;
        thisOpen = true;
        predmet = "пусто";
    }

    public Korobka(String color, int size, boolean thisOpen, String predmet) {
        this.color = color;
        this.size = size;
        this.thisOpen = thisOpen;
        this.predmet = predmet;
    }
    //конструкторы//конструкторы

    //методы
    public void open() {
        this.thisOpen = true;
        System.out.println("Коробка открыта");
    }

    public void close() {
        this.thisOpen = false;
        System.out.println("Коробка закрыта");
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println("Цвет изменен на " + color);
    }

    public void changePredmet(String predmet) {
        if (thisOpen == false) {
            System.out.println("Коробка закрыта, открой ее, чтобы сменить предмет");
        } else if (this.predmet.equals("пусто")) {
            this.predmet = predmet;
            System.out.println("Предмет изменен на " + predmet);
        } else {
            System.out.println("Сперва освободи коробку");
        }
    }

    public void deletePredmet() {
        this.predmet = "пусто";
        System.out.println("Коробка очищена");
    }

    public void info() {
        String openClose = "неизвестно";
        if (thisOpen == true) {
            openClose = "открыта";
        } else {
            openClose = "закрыта";
        }
        System.out.println("цвет коробки " + color + "\n" +
                "размер коробки " + size + "\n" +
                "коробка " + openClose + "\n" +
                "в коробке " + predmet);
        //методы//методы
    }
}