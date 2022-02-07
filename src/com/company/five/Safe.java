package com.company.five;

public class Safe {
    Item[] items;
    int price;

    public Safe(Item[] items, int price) {
        this.items = items;
        this.price = price;
    }

    public Item[] getItems() {
        return items;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String s = "Предметы: ";
        for (Item item : items) {
            s += (item.getName() + " ");
        }
        s += "\n";
        s += "Стоимость:" + price;
        return s;
    }
}
