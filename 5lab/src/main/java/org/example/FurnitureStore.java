package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FurnitureStore {
    private final Furniture furniture;

    @Autowired
    public FurnitureStore(@Qualifier("tableBean") Furniture furniture) {
        this.furniture = furniture;
    }

    public void showFurniture() {
        System.out.println("Furniture type: " + furniture.getType());
    }
}
