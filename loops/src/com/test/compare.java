package com.test;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = in.nextInt();
        System.out.println("enter the number your want to compare:");
        int com = in.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == com){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
