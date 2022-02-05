package com.company.fourth;

public class Two extends Digit{
    public Two(char symbol) {
        super(symbol);
    }

    @Override
    public void setContent() {
        StringBuilder template1=new StringBuilder();
        StringBuilder template2=new StringBuilder();
        StringBuilder template3=new StringBuilder();
        StringBuilder template4=new StringBuilder();
        StringBuilder template5=new StringBuilder();
        StringBuilder template6=new StringBuilder();
        StringBuilder template7=new StringBuilder();

        template1.append(" ").append(symbol).append(symbol).append(symbol).append(" ");
        template2.append(symbol).append("   ").append(symbol);
        template3.append(symbol).append("  ").append(symbol).append(" ");
        template4.append("  ").append(symbol).append("  ");
        template5.append(" ").append(symbol).append("   ");
        template6.append(symbol).append("    ");
        template7.append(symbol).append(symbol).append(symbol).append(symbol).append(symbol);

        content.add(template1.toString());
        content.add(template2.toString());
        content.add(template3.toString());
        content.add(template4.toString());
        content.add(template5.toString());
        content.add(template6.toString());
        content.add(template7.toString());
    }
}
