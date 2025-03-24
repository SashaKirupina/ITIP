package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        FurnitureStore store = context.getBean(FurnitureStore.class);
        store.showFurniture();

        context.close();
    }
}