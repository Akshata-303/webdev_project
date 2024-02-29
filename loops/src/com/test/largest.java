package com.test;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter a value ");
        int a = in.nextInt();
        System.out.print("enter b value ");
        int b = in.nextInt();
        System.out.print("enter c value ");
        int c = in.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);



    }
}
