package com.company.fourth;

public class Eight extends Digit{
    public Eight(char symbol) {
        super(symbol);
    }

    @Override
    public void setContent() {
        StringBuilder template1=new StringBuilder();
        StringBuilder template2=new StringBuilder();

        template1.append(" ").append(symbol).append(symbol).append(symbol).append(" ");
        template2.append(symbol).append("   ").append(symbol);

        content.add(template1.toString());
        content.add(template2.toString());
        content.add(template2.toString());
        content.add(template1.toString());
        content.add(template2.toString());
        content.add(template2.toString());
        content.add(template1.toString());
    }
}
