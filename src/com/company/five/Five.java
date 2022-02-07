package com.company.five;

import java.util.Arrays;
import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество предметов:");
        int n = Integer.parseInt(in.nextLine());
        System.out.println("Введите объем сейфа:");
        int safeVolume = Integer.parseInt(in.nextLine());
        Item[] items = new Item[n];
        System.out.println("Вводите название, объем, ценность предметов");
        for (int i = 0; i < n; i++) {
            items[i] = new Item(
                    in.nextLine(),
                    Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine())

            );
        }
        Safe[][] safe = new Safe[n + 1][safeVolume + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < safeVolume + 1; j++) {
                if (i == 0 || j == 0) { //нулевые строки заполним нулями
                    safe[i][j] = new Safe(new Item[]{}, 0);
                    continue;
                }
                if (i == 1) {//первая строка - на выбор только один предмет
                    safe[i][j] = items[0].getVolume() <= j ? new Safe(new Item[]{items[0]}, items[0].getPrice())
                            : new Safe(new Item[]{}, 0);
                    continue;
                }

                if (items[i - 1].getVolume() > j) {//текущий предмет не влезает - кладем предыдущий max
                    safe[i][j] = safe[i - 1][j];
                } else {
                    int newPrice = items[i - 1].getPrice() + safe[i - 1][j - items[i - 1].getVolume()].getPrice();
                    if (safe[i - 1][j].getPrice() > newPrice) {
                        safe[i][j] = safe[i - 1][j];
                    } else {
                        Item[] newItems = Arrays.copyOf(safe[i - 1][j - items[i - 1].getVolume()].getItems(), safe[i - 1][j - items[i - 1].getVolume()].getItems().length + 1);
                        System.arraycopy(new Item[]{items[i - 1]}, 0, newItems, safe[i - 1][j - items[i - 1].getVolume()].getItems().length, 1);
                        safe[i][j] = new Safe(newItems, newPrice);
                    }
                }
            }
        }

        System.out.print(safe[n][safeVolume]);

    }
}


//тест
//Введите количество предметов:
//        5
//        Введите объем сейфа:
//        8
//        Вводите название, объем, ценность предметов
//блокнот
//1
//600
//часы
//2
//5000
//серьги
//4
//1500
//ноутбук
//2
//40000
//зарядка
//1
//500
//Предметы: часы серьги ноутбук
//        Стоимость:46500
