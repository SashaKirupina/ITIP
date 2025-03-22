package org.example;

public class Main {
    public static void main(String[] args) {
        //Создание объектов мебели
        Table table = new Table("Wood", "Brown", "Round");
        Chair chair = new Chair("Steel", "Black", true);
        Bed bed = new Bed("Wood", "White", "200x180 cm");

        System.out.println("Furniture information");
        table.showInfo();
        System.out.println();

        chair.showInfo();
        System.out.println();

        bed.showInfo();
    }
}