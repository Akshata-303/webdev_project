package com.akshata;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistexample {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        //list.add(547);
        //list.add(675);
        //list.add(57);
       // list.add(334);
       // list.add(765);
        //list.add(89);

        System.out.println(list);


        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here
        }
    }
}
