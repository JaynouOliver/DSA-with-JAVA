package com.Subhro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        String name = "Subhro";
        char target = 'S';
        System.out.println(search(name, target));
    }

   // Searching in Strings
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        // running a for loop here;
       for (int i = 0; i < str.length(); i++) {
           if (target == str.charAt(i)){
               return true;
           }
       }
       // if none of the code works, return false;
       return false;
   }

    // Searching in Strings with enhaced for loop;
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        // running a for loop here;
        for(char ch: str.toCharArray()){ 
            
            // "toCharArray" converts the given string to character array;
            //(     example: "Subhro" gets converted to [S, u, b, h, r, o]      )
            
            if (ch == target){
                return true;
            }
        }
            
        // if none of the code works, return false;
        return false;
    }


}
