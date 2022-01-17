package com.Subhro;

import java.util.Arrays;

public class Project1 {
    public static void main(String[] args) {
        int[] array =   {5, 4, 2, 1,3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }



    static void bubbleSort(int[] array){
        boolean swapped;
        // run the steps n-1 times;
        for (int i = 0; i < array.length; i++) {
            // for each step, max item will come at the last respective index;
            swapped = false;
            for (int j = 1; j <= array.length - i -1; j++) {
                // swap if the item is smaller than the previous item;
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            // if not swapped for a particular value of i, that means the array is sorted hence stop the program.
            if(!swapped){
                break;
            }
        }


    }

}
