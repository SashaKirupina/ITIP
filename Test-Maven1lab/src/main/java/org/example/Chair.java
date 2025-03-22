package org.example;

// Класс "Стул"
public class Chair extends Furniture {
    //есть ли спинка у стула
    private boolean hasBackrest;

    public Chair(String material, String color, boolean hasBackrest) {
        super(material, color);
        this.hasBackrest = hasBackrest;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Наличие спинки: " + (hasBackrest ? "Да" : "Нет"));
    }
}
