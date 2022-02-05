package com.company.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Five {
    public static int safeVolume;
    public static int maxPrice=Integer.MAX_VALUE;
    public static List<Item> bestList=null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество предметов:");
        int n = Integer.parseInt(in.nextLine());
        System.out.println("Введите объем сейфа:");
        safeVolume=Integer.parseInt(in.nextLine());
        List<Item> list = new ArrayList<>();
        System.out.println("Вводите название, объем, ценность предметов");
        for (int i = 0; i < n; i++) {
            list.add(
                    new Item(
                            in.nextLine(),
                            Integer.parseInt(in.nextLine()),
                            Integer.parseInt(in.nextLine())
                    )
            );
        }
        search(list);
        System.out.println("Наилучший набор предметов:");
        System.out.println(bestList);

    }

    public static int calcVolume(List<Item> itemList) {
        int sum = 0;
        for (Item i : itemList) sum += i.getVolume();
        return sum;
    }

    public static int calcPrice(List<Item> itemList) {
        int sum = 0;
        for (Item i : itemList) sum += i.getPrice();
        return sum;
    }

    public static void checkBest(List<Item> itemList) {
        if (bestList == null) {
            if (calcVolume(itemList) <= safeVolume) {
                bestList = itemList;
                maxPrice = calcPrice(itemList);
            }
        } else {
            if (calcVolume(itemList) <= safeVolume && calcPrice(itemList) > maxPrice) {
                bestList = itemList;
                maxPrice = calcPrice(itemList);
            }
        }
    }

    public static void search(List<Item> itemList) {
        if (itemList.size() > 0)
            checkBest(itemList);
        for (int i = 0; i < itemList.size(); i++) {
            List<Item> newListItem = new ArrayList<>(itemList);
            newListItem.remove(i);
            search(newListItem);
        }
    }
}
//тест
//Введите количество предметов:
//        5
//        Введите объем сейфа:
//        8
//        Вводите название, объем, ценность предметов
//        блокнот
//        1
//        600
//        часы
//        2
//        5000
//        серьги
//        4
//        1500
//        ноутбук
//        2
//        40000
//        зарядка
//        1
//        500
//        Наилучший набор предметов:
//        [Item{name='часы ', volume=2, price=5000}, Item{name='серьги', volume=4, price=1500}, Item{name='ноутбук', volume=2, price=40000}]

