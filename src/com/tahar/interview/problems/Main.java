package com.tahar.interview.problems;

public class Main {

    public static void main(String[] args) {
	 int[] nums = {1,5,1,6,9,2,3,57,2};
	 int peakPos = findPeakElement(nums);
        System.out.println("Peak Position :" + peakPos);
    }
     private static int findPeakElement(int[] nums) {
       int n = nums.length;
       int L = 0;
       int R = n - 1;
       while(L < R) {
           int m = (L + R +1) /2;
           if(nums[m-1] > nums[m]) {
               R = m - 1 ;
           }
           else {
               L = m;
           }

       }

        return L;
    }
}
