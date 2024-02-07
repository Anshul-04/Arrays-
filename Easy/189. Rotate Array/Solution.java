package Easy.189. Rotate Array;

https://leetcode.com/problems/rotate-array/description/

public class Solution {
  public void rotate(int[] nums, int k) {
    int n= nums.length;

    if(n==0 || n==1){
        return;
    }

     // Calculate effective rotation count
    k = k % n;

    //reverse whole array
    reverse(nums,0,n-1);

    //reverse first K elements
    reverse(nums,0,k-1);

    // reverse n-k elements
    reverse(nums,k,n-1);
  }

  public void reverse(int[]arr,int s,int e){
      while(s<e){
          int temp = arr[s];
          arr[s] = arr[e];
          arr[e] = temp;
          s++;
          e--;
      }
  }
  
}
