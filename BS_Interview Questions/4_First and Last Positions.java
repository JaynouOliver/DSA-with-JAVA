package com.Subhro;

public class FirstaandLastPositions {

    public static void main(String[] args) {



    }

    public int[] searchRange(int[] nums, int target){

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;


    }



    // function to return the index values of target;

    int search(int[] nums, int target, boolean findStartIndex){

        int answer = -1;
        int start = 0;
        int end  = nums.length -1;

        while (start<= end){
            int mid = start + (end - start)/2;


            if (target < nums[mid]){
                end = mid -1;

            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                //answer might be found
                answer = mid;
                if (findStartIndex){
                    end = mid - 1;
                }
                else {
                    start = mid  + 1;
                }
            }
        }
        return  answer;
    }
}
