package com.test;

import java.util.Scanner;

public class upper_lower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // trim()= removes space
        //charAt(0)= character at 0th idex
        char ch = in.next().trim().charAt(0);

        if((ch >= 'a') && (ch <= 'z')){
            System.out.println(ch + " is a lower case");
        }
        else{
            System.out.println(ch + " is a upper case");
        }



    }
}
