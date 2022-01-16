package com.Subhro;

public class Project1 {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] ints: accounts){
            int sum = 0;
            for (int anInt : ints){
                sum  += anInt;
            }
            if(sum > ans){
                ans =sum;
            }
        }
        return ans;

    }

}
