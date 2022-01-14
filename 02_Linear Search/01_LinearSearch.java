package com.Subhro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    // search the array: return the element if the item is found.
    // otherwise, if the item is not found, return (-1).

    static int linearSearch(int[] array, int target){
        if (array.length == 0){
            return -1;
        }

        // run a for loop;
        for (int index = 0; index < array.length; index++) {
            // check for the element at every index if it is = target;
            int element = array[index];
            if (element == target){
                return index;
            }
        }

        // if none of the above return statements has executed, it will run the below statements;
        // which implies that the target is not found;


        return -1;
    }


}
