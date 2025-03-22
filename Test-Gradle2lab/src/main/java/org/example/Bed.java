package org.example;

// Класс "Кровать"
public class Bed extends Furniture {
    //размер кровати
    private String size;

    public Bed(String material, String color, String size) {
        super(material, color);
        this.size = size;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bed size: " + size);
    }
}