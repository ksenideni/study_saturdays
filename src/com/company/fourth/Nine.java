package com.company.fourth;

public class Nine extends Digit {
    public Nine(char symbol) {
        super(symbol);
    }

    @Override
    public void setContent() {
        StringBuilder template1 = new StringBuilder();
        StringBuilder template2 = new StringBuilder();
        StringBuilder template3 = new StringBuilder();

        template1.append(" ").append(symbol).append(symbol).append(symbol).append(symbol);
        template2.append(symbol).append("   ").append(symbol);
        template3.append("    ").append(symbol);

        content.add(template1.toString());
        content.add(template2.toString());
        content.add(template2.toString());
        content.add(template1.toString());
        content.add(template3.toString());
        content.add(template3.toString());
        content.add(template3.toString());

    }
}
