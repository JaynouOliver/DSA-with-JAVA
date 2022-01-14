package com.Subhro;

import java.util.Arrays;

public class Project1 {

    public static void main(String[] args) {

       int[][] array = {

               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9},

       };

       int target = 9;
       int[] ans = Finin2dArray(array, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Finin2dArray(int[][] array, int target){


        for (int rows = 0; rows < array.length; rows++) {
            for (int cols = 0; cols < array[rows].length; cols++) {
                if (array[rows][cols] == target){
                    return new int[] {rows, cols};
                }
            }
        }

        return new int[] {-1, -1};
    }


    // Optimised Approach;
    static int Finin2dArrays(int[][] array, int target){

    int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }







}
