package com.company.five;

import java.util.List;

public class Five {
    public static int safeVolume;
    public static int maxPrice;
    public static List<Item> list;
    public static void main(String[] args) {

    }
    public static int calcVolume(List<Item> itemList){
        int sum=0;
        for(Item i: itemList) sum+=i.getVolume();
        return sum;
    }

    public static int calcPrice(List<Item> itemList){
        int sum=0;
        for(Item i: itemList) sum+=i.getPrice();
        return sum;
    }

    public static void checkBest(List<Item> itemList){
        if(list==null){
            if(calcVolume(itemList)<=safeVolume){
                list=itemList;
                maxPrice=calcPrice(itemList);
            }
        }
        else {
            if(calcVolume(itemList)<=safeVolume && calcPrice(itemList)>maxPrice){
                list=itemList;
                maxPrice=calcPrice(itemList);
            }
        }
    }
}
