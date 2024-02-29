package com.switchstatements;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter ID");
        int ID = in.nextInt();
        String dep = in.next();

        switch (ID) {
            case 1 -> System.out.println("akshata");
            case 2 -> System.out.println("apurva");
            case 3 -> {
                System.out.println("employ number 3");
                switch (dep) {
                    case "IT" -> System.out.println("IT department");
                    case "teacher" -> System.out.println("teacher");
                    default -> System.out.println("enter valid department");
                }
            }
            default -> System.out.println("enter correct ID");
        }
    }
}
