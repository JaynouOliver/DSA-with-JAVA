package com.Subhro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    // Working with array list;
    // Array list is similar to vectors in C++;
    // When an array list becomes full, it doubles its size and transfers the elements to the new list;

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10); // syntax of an array list

        list.add(123);list.add(23); // adding elements to the array list
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);list.add(3);list.add(45); // multiple inputs in the same line work too.
        list.add(123);list.add(324);list.add(234);
        list.add(123);list.add(3245);

        list.set(0, 99); // this command is used to change any element in the array list.
        // for example here we have changed the 0th element to 99.

        list.remove(1);
        // this command is used to remove any element from the array list.
        // for example here I have removed the "second" element from the array list.

        System.out.println(list);



        // taking input from the user;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
        
        System.out.println(list);




    }


}
