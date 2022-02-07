package com.company.fourth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int duplicateN = n;
        int maxDigit = -1;
        Map<Integer, Digit> map = new HashMap();
        do {
            int currentDigit = duplicateN % 10;
            map.put(currentDigit, make(currentDigit, '*'));
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            duplicateN /= 10;
        }
        while (duplicateN > 0);
        map.put(maxDigit, make(maxDigit, (char) (maxDigit + '0')));
        String s = String.valueOf(n);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < s.length(); j++) {
                int digit = s.charAt(j) - '0';
                System.out.print(map.get(digit).getContent().get(i));
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static Digit make(int choice, char symbol) {
        switch (choice) {
            case 0:
                return new Zero(symbol);
            case 1:
                return new One(symbol);
            case 2:
                return new Two(symbol);
            case 3:
                return new Three(symbol);
            case 4:
                return new Four(symbol);
            case 5:
                return new Five(symbol);
            case 6:
                return new Six(symbol);
            case 7:
                return new Seven(symbol);
            case 8:
                return new Eight(symbol);
            case 9:
                return new Nine(symbol);
        }
        return null;
    }
}
