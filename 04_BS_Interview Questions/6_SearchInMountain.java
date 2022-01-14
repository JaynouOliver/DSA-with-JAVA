package com.Subhro;

public class SearchInMountains {

    public static void main(String[] args) {

    }

    int search(int[] array, int target){
        int peak = peakIndexInMountainArray(array);
        int firstTry = binarySearch(array, target, 0, peak );
        if (firstTry != -1){
            return firstTry;
        }
        // try to search for the 2nd half;
        return orderAgnosticBS(array, target, peak+1, array.length -1 );

    }

    static int binarySearch(int[] arr, int target, int start, int end) {


        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }

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

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {


        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
