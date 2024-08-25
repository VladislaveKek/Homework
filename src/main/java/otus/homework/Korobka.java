package otus.homework;

public class Korobka {
    public String color;
    private int size;
    public String status;
    public String predmet;

    public Korobka() {
        color = "коричневый";
        size = 1;
        status = "открыта";
        predmet = "пусто";
    }

    public Korobka(String color, int size, String status, String predmet) {
        this.color = color;
        this.size = size;
        this.status = status;
        this.predmet = predmet;
    }

    public void openKorobka() {
        this.status = "открыта";
        System.out.println("Коробка открыта");
    }

    public void closeKorobka() {
        this.status = "закрыта";
        System.out.println("Коробка закрыта");
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println("Цвет изменен на " + color);
    }

    public void changePredmet(String predmet) {
        if (status == "закрыта") {
            System.out.println("Коробка закрыта, открой ее, чтобы сменить предмет");
        } else if (this.predmet == "пусто") {
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
        System.out.println("цвет коробки " + color + "\n" +
                "размер коробки " + size + "\n" +
                "коробка " + status + "\n" +
                "в коробке " + predmet);
    }
}