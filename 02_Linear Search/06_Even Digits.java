package com.Subhro;

public class Project1 {
    public static void main(String[] args) {
        int[]   nums = {1, 33, 43, 53, 5, 35, 565675, 66585,67585};
//        System.out.println(findNumbers(nums));
//        System.out.println(digits(23456));

        System.out.println(digits2(nums));

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

    static int digits2(int num){

        if(num < 0){
            num = num *- 1;
        }
        return (int)(Math.log10(num));
    }


    //count number of digits in a number;
    static int digits(int num){

        if(num < 0){
            num = num * -1;

        }
        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }


}
