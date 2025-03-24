package org.example;

import org.springframework.stereotype.Component;

@Component("tableBean")
public class Table implements Furniture {
    @Override
    public String getType() {
        return "Table";
    }
}
