package org.example;

import org.springframework.stereotype.Component;

@Component("chairBean")
public class Chair implements Furniture {
    @Override
    public String getType() {
        return "Chair";
    }
}
