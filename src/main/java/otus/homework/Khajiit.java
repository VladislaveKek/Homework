package otus.homework;

import java.util.Random;

public class Khajiit {
    public String name;
    public String familyName;
    public int yearBirth;
    public String countryBirth;
    public String profession;

    public Khajiit() {
        name = "Майк";
        familyName = "Котожид";
        yearBirth = 427;
        countryBirth = "Эльсвейр";
        profession = "Лжец";
    }

    public Khajiit(String name,
                   String familyName,
                   int yearBirth,
                   String countryBirth,
                   String profession) {

        this.name = name;
        this.familyName = familyName;
        this.yearBirth = yearBirth;
        this.countryBirth = countryBirth;
        this.profession = profession;
    }

    public void info() {
        System.out.println("\n" +
                "Имя и Фамилия: " + name + " " + familyName + "\n" +
                "Год рождения и страна: " + yearBirth + " " + countryBirth + "\n" +
                "Деятельность: " + profession);
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public String getCountryBirth() {
        return countryBirth;
    }

    public String getProfession() {
        return profession;
    }
}