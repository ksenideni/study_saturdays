package com.company.third;

import java.util.*;

public class Third {
    public static HashSet<Character> set = new HashSet<>(Arrays.asList('у', 'е', 'ы', 'а', 'о', 'э', 'я', 'ю', 'и', 'У', 'Е', 'Ы', 'А', 'О', 'Э', 'Я', 'И', 'Ю'));

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

//        System.out.println(task1(s));
//        task2(s);
//        task3(s);
    }

    public static int task1(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                result++;
            }
        }
        return result;
    }

    public static void task2(String s) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new ArrayList<>());
        }
        StringBuilder sAsBuider = new StringBuilder(s);
        StringBuilder word = new StringBuilder();
        int k;
        char c = '.';
        for (int i = 0; i < sAsBuider.length(); i++) {
            c = sAsBuider.charAt(i);
            if (c == '!' || c == '?' || c == ',' || c == '.') {
                k = task1(word.toString());
                list.get(k).add(word.toString());
                word.setLength(0);
                i++;//дальше будет пробел
                continue;
            }
            if (c == ' ') {
                k = task1(word.toString());
                list.get(k).add(word.toString());
                word.setLength(0);
                continue;
            }
            word.append(c);
        }
        if (!(c == '!' || c == '?' || c == '.')) {
            k = task1(word.toString());
            list.get(k).add(word.toString());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            ArrayList arr = list.get(i);
            for (int j = 0; j < arr.size(); j++) {
                System.out.println(arr.get(j) + " ");
            }
        }
    }


    public static void task3(String s){
        StringBuilder sAsBuider = new StringBuilder(s);
        boolean fl=false;
        for (int i = 0; i < sAsBuider.length(); i++) {
            char c = sAsBuider.charAt(i);
            if(set.contains(c) && !fl){
                if(c>='а') {
                    c+='А' - 'а';
                    sAsBuider.setCharAt(i, c);
                }
                fl=true;
            }
            if (c == '!' || c == '?' || c == ',' || c == '.') {
                fl=false;
                i++;//дальше будет пробел
                continue;
            }
            if (c == ' ') {
                fl=false;
                continue;
            }
        }
        System.out.println(sAsBuider.toString());
    }
}