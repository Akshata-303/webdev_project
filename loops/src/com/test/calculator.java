package com.test;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till user does not press x
        int ans = 0;

        while(true){
            System.out.print("enter operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.print("enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if(op == '+'){
                    ans = num1 + num2;
                }
                else if (op == '-') {
                    ans = num1 - num2;
                }
                else if (op == '*') {
                    ans = num1 * num2;
                }
                else if (op == '/') {
                    if(num2!=0){
                        ans = num1 / num2;
                    }
                }
                else if (op == '%') {
                    if(num2!=0){
                        ans = num1 % num2;
                    }
                }




            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("invalid operation");
            }
            System.out.println(ans);


        }


    }
}
