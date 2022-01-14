package com.Subhro;

import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        int[] array = new int[5]; // declaration and dynamic memory allocation of the array of size (5);

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();    // this for loop is used to take input from the user.
        }

        System.out.println(Arrays.toString(array)); // to String converts arrays into strings and prints them out.


    }



}
