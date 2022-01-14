package com.Subhro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    // Working with multi-dimensional array list;
    // Array list is similar to vectors in C++;

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        swap(array, 1, 2); // Here we are swapping the 2nd number with the third;

        System.out.println(Arrays.toString(array));


    }
    static void swap(int[] array, int num1, int num2){ // This is a function made to swap two numbers;
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }




}
