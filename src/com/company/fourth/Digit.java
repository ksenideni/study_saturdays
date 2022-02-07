package com.company.fourth;

import java.util.ArrayList;
import java.util.List;

public abstract class Digit {
    protected char symbol;
    protected List<String> content;

    public abstract void setContent();

    public Digit(char symbol) {
        this.symbol = symbol;
        content = new ArrayList<>();
        setContent();
    }

    public void printDigit() {

        for (String s : content) {
            System.out.println(s);
        }
    }

    public List<String> getContent() {
        return content;
    }
}
