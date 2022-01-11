package com.Subhro;

import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        // playing with arrays;

        Scanner in = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("The third array is " + array[2]); // this shows the value of arrays before giving the inputs.


        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        for(int num: array){
            System.out.print(num + " "); // printing the arrays with an enhanced for loop, in the same line.(num represents the element of the array)
        }

        System.out.println(); // Printing an empty line here.

        System.out.println("The third array is " + array[2]); // this shows the value of arrays after giving the inputs.

    }



}
