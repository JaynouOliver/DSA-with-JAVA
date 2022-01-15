package com.Subhro;

public class Project1 {
    public static void main(String[] args) {
        int[]   nums = {1, 33, 43, 53, 5, 35, 565675, 66585,67585};
        System.out.println(findNumbers(nums));


    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not;
    static boolean even(int num) {
        int numberofDigits = digits(num);
        /*
        if (numberofDigits % 2 == 0){
            return true;
        }
        return false;
         */
        return numberofDigits %  2 == 0;
    }
    //count number of digits in a number;
    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }


}
