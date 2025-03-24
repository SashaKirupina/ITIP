package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получаем бин мебели и передаем его в Dealer
        Furniture furniture = context.getBean("TableBean", Furniture.class);
        FurnitureStore furnitureStore = new FurnitureStore(furniture);
        furnitureStore.printType();  // Выводит "Тип мебели: Стол"

        context.close();
    }
}