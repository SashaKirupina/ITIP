package org.example;

// Базовый класс
public class Furniture {

    protected String material;
    protected String color;

    // Конструктор класса Furniture
    public Furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Метод для отображения информации о мебели
    public void showInfo() {
        System.out.println("Material: " + material + ", Color: " + color);
    }
}