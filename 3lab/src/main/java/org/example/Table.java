package org.example;

// Класс "Стол"
public class Table extends Furniture {
    //Форма стола
    private String shape;

    public Table(String material, String color, String shape) {
        //Вызов родительского класса
        super(material, color);
        this.shape = shape;
    }

    // Переопределенный метод для вывода информации
    @Override
    public void showInfo() {
        super.showInfo(); // Вызывает метод из Furniture
        System.out.println("Форма стола: " + shape);
    }
}