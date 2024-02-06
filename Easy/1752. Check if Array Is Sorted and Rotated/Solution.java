package Easy.1752. Check if Array Is Sorted and Rotated;

https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/ 

// # BRUTE FORCE
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            // / Rotate the array by shifting all elements to the left
            leftRotate(nums);
            // check if rotated array is sorted or not
            if(isSorted(nums)){
                return true;
            }
        }
        return false;
    }
    // Helper method to rotate the array by shifting all elements to the left
    public void leftRotate(int[]a){
        int n = a.length;
        int first = a[0];

        for(int i=0;i<n-1;i++){
            a[i] = a[i+1];
        }
        a[n-1] = first;
    }

    // Helper method to check if the array is sorted
    public boolean isSorted(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }
}
/*  
 Complexity Analysis
 Time complexity: O(n^2) - We check all possible rotations, and for each rotation, we check if the array is sorted, which takes O(n) time.
 Space complexity: O(n) - We create a copy of the original array. 
 
 */