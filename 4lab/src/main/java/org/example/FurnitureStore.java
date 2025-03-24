package org.example;

public class FurnitureStore {
    private Furniture furniture;

    // IoC: инъекция зависимости через конструктор
    public FurnitureStore(Furniture furniture) {
        this.furniture = furniture;
    }

    public void printType() {
        System.out.println("Type: " + furniture.getType());
    }
}
