package otus.homework;

public class HomeworkClass {
    public static void main(String[] args) {
        Khajiit[] catParty = {
                new Khajiit(),
                new Khajiit("Абубакр", "Ахмед", 1970, "Чегдомыния", "Инвестор"),
                new Khajiit("Вася", "Павлинов", 2010, "Краснодария", "Блогер"),
                new Khajiit("Костя", "Шмостя", 1974, "Московия", "Заводчанин"),
                new Khajiit("Иван", "Богатырев", 2001, "Славия", "Крестьянин"),
                new Khajiit("Володя", "Снежный", 1345, "Румыния", "Вампир"),
                new Khajiit("Борис", "Бритва", 1999, "Питерлэндия", "Барбер"),
                new Khajiit("Дон", "Жон", 1999, "Рим", "Легионер"),
                new Khajiit("Иллидан", "Бурный", 1024, "Темерия", "Плотник"),
                new Khajiit("Маугли", "Панзер", 2023, "Джунглия", "Отшельник"),
        };
        for (int i = 0; i < catParty.length; i++) {
            if (catParty[i].yearBirth < 1984) {
                catParty[i].info();
            }
        }
        // Последняя часть квеста
        Korobka korobka1 = new Korobka("желтый", 3, false, "мяч");
        System.out.println("- - - - -");
        korobka1.info();

        System.out.println("- - - - -");
        korobka1.changeColor("красный");

        System.out.println("- - - - -");
        korobka1.changePredmet("копье");

        System.out.println("- - - - -");
        korobka1.open();
        korobka1.changePredmet("копье");

        System.out.println("- - - - -");
        korobka1.deletePredmet();
        korobka1.changePredmet("копье");

        System.out.println("- - - - -");
        korobka1.info();
    }
}