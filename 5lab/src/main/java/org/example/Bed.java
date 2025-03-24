package org.example;

import org.springframework.stereotype.Component;

@Component("bedBean")
public class Bed implements Furniture {
    @Override
    public String getType() {
        return "Bed";
    }
}
