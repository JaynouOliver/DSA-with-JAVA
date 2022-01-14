package com.Subhro;

public class Project1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 1;

        System.out.println(SearchinRange(array, target, 3,8));
    }


    static int SearchinRange(int[] array, int target, int start, int end){
        if (array.length == 0){
            return -1;
        }

        // run a for loop;
        for (int index = start; index <= end; index++) {
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
