package org.example;

public class Main {
    public static void main(String[] args) {
        //Создание объектов мебели
        Table table = new Table("Дерево", "Коричневый", "Круглый");
        Chair chair = new Chair("Металл", "Черный", true);
        Bed bed = new Bed("Дерево", "Белый", "200x180 см");

        System.out.println("Информация о мебели");
        table.showInfo();
        System.out.println();

        chair.showInfo();
        System.out.println();

        bed.showInfo();
    }
}
