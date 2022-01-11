package com.Subhro;

import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] array){
        array[0] = 99;
    }



}
