package com.switchstatements;

import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "apple" -> System.out.println("sweet fruit");
//            case "mango" -> System.out.println("king of fruits");
//            case "orange" -> System.out.println("citrus");
//            case "grapes" -> System.out.println("small");
//            default -> System.out.println("invalid choice");
//        }

        int day = in.nextInt();
        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thrusday");
            case 6 -> System.out.println("friday");
            default -> System.out.println("invalid");


        }


    }
}
