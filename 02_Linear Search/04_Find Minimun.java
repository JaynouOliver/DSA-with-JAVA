package com.Subhro;

public class Project1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        System.out.println(FindMin2(array));
    }

    // Finding the minimum in the array;
    static int FindMin(int[] array){
        int ans = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < ans){
                ans = array[i];
            }

        }

        return ans;
    }

    //Replaced with enhanced for loop;
    static int FindMin2(int[] array){
        int ans = array[0];
        for (int j : array) {
            if (j < ans) {
                ans = j;
            }

        }

        return ans;
    }






}
