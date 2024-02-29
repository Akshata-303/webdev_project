package com.test;

public class conditionals {
    public static void main(String[] args) {
      /*




      */
        int salary = 2000;
        if(salary > 1000){
            salary += 100;
        }
        else if (salary > 1500){
            salary += 200;
        }
        else{
            salary += 50;
        }
        System.out.println(salary);
        }
    }