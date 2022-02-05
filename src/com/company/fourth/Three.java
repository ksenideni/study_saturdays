package com.company.fourth;

public class Three extends Digit{

    public Three(char symbol) {
        super(symbol);
    }

    @Override
    public void setContent() {
        StringBuilder template1=new StringBuilder();
        StringBuilder template2=new StringBuilder();
        StringBuilder template3=new StringBuilder();
        StringBuilder template4=new StringBuilder();

        template1.append(symbol).append(symbol).append(symbol).append("  ");
        template2.append("   ").append(symbol);
        template3.append("  ").append(symbol).append(" ");
        template4.append(symbol).append(symbol).append("  ");

        content.add(template1.toString());
        content.add(template2.toString());
        content.add(template3.toString());
        content.add(template4.toString());
        content.add(template3.toString());
        content.add(template2.toString());
        content.add(template1.toString());
    }
}
