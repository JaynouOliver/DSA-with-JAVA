package com.Subhro;

public class Mountain {
    public static void main(String[] args) {




    }
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/
    

    public int peakIndexInMountainArray(int[] array){
        int start = 0;
        int end = array.length -1;

        while (start < end){
            int middle = start + (end - start) / 2;
            if (array[middle] > array[middle + 1]){
                // you are in decreasing part of array;
                // maybe the answer;, but look at left
                // this is why end != mid -1;
                end = middle;
            }
            else {

                start = middle + 1; // coz mid + 1 element > mid element;

            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}
