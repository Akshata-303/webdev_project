package com.test;

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int b = 0;
        int count = 2;
        while (count <= n){
           int temp = a;
           a = a + b;
           b = temp;
           count++;
//            System.out.println(a);
        }
        System.out.println(a);

    }
}
