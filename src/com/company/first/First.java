package com.company.first;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int result = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                result += c - '0';
            }
        }
        System.out.println(result);
    }
}
//тест
//zdxfcgvhbjnkml_546_sdfgh
//15