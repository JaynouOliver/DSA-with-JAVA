package com.Subhro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    // Working with multi-dimensional array list;
    // Array list is similar to vectors in C++;

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 6, 7, 8, 89, 12, 45};

        System.out.println(max(array));

    }
    static int max(int[] array){
        int maxValue = Integer.MIN_VALUE;
        for(int num: array){
            if(num > maxValue){
                maxValue = num;
            }
        }
        return maxValue;
    }

}
