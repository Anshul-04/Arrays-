package Easy.283. Move Zeroes;
https://leetcode.com/problems/move-zeroes/description/

public class Solution {
  
  // #Optimal In place solution
  public void moveZeroes(int[] nums) {
    int count=0;

    for(int i=0;i<nums.length;i++){
        // moving (copying) non-zero element to front
        if(nums[i]!=0){
            nums[count++] = nums[i];
        }
    }

    // filling rest of array elements with zero
    while(count<nums.length){
        nums[count++] = 0;
    }
  }

  // Extra space Brute force solution

  public static int[] moveZeros(int n, int []arr) {
        int[] temp = new int[n];
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!= 0){
                temp[index] = arr[i];
                index++;
            }
        }

        while(index<n){
            temp[index++] = 0;
        }

        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        return arr;
      }
}
