package com.Subhro;

import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

         //Syntax of a 2d array;
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };


        Scanner in = new Scanner (System.in);

        int[][] arr = new int[2][2];

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) { // This is one way of printing out a given 2D array.
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }


        for (int i = 0; i < arr.length; i++) { // This is another way of printing out a given 2d array.
            System.out.println(Arrays.toString(arr[i]));
        }


        for(int[]num : arr){
            System.out.println(Arrays.toString(num)); // This is how we print arrays with an enhanced for loop
        }




    }


}
