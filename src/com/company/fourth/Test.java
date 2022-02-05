package com.company.fourth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int duplicateN = n;
        Set<Integer> set = new HashSet<>();
        if (duplicateN == 0) {
            set.add(0);
        } else {
            while (duplicateN > 0) {
                set.add(duplicateN % 10);
                duplicateN/=10;
            }
        }
        Integer[] arr = new Integer[set.size()];
        int k=0;
        for (int a: set){
            arr[k]=a;
            k++;
        }
        Digit[] arrOfContent = new Digit[10];
        for(int i=0; i<arr.length-1; i++){
            arrOfContent[arr[i]]=make(arr[i], '*');
        }
        arrOfContent[arr[arr.length-1]]=make(arr[arr.length-1], (char)(arr[arr.length-1].intValue() + '0'));

        HashMap<Integer, Digit> hashMap = new HashMap<>();
        for(int i=0; i<arrOfContent.length; i++){
            Digit d=arrOfContent[i];
            if(d==null) continue;
           hashMap.put(i, d);
        }

        System.out.println(hashMap);

        if(n==0) {
            hashMap.get(n).printDigit();
            return;
        }
        String s= String.valueOf(n);
        for(int i=0; i<7; i++){
            for(int j=0; j<s.length(); j++){
                int digit = s.charAt(j)-'0';
                System.out.print(hashMap.get(digit).getContent().get(i));
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static Digit make(int choice, char symbol){
        switch (choice){
            case 0:return new Zero(symbol);
            case 1:return new One(symbol);
            case 2:return new Two(symbol);
            case 3:return new Three(symbol);
            case 4:return new Four(symbol);
            case 5:return new Five(symbol);
            case 6:return new Six(symbol);
            case 7:return new Seven(symbol);
            case 8:return new Eight(symbol);
            case 9:return new Nine(symbol);
        }
        return null;
    }
}
