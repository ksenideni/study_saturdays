package com.company.second;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        try {
            number=Math.abs(in.nextInt());//если число отрицательное
            if(number==0){
                System.out.println("Введено число 0.");
                return;
            }
            if(number==1){
                System.out.println("Введено число, равное по модулю 1.");
                return;
            }


            int i=2;
            Set<Integer> set=new HashSet();

            while(number>1){
                if(number%i==0){
                    set.add(i);
                    number/=i;
                }
                else{
                    i++;
                }
            }

            for (int e: set) {
                System.out.print(e + " ");
            }
        }
        catch (Exception e){
            System.out.println("Введено не целое число");
        }
    }
}
