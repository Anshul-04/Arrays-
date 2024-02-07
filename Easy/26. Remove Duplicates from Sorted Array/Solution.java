package Easy.26. Remove Duplicates from Sorted Array;

https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class Solution {

  // #Brute Force 
  public int removeDuplicates(int[] nums) {
    HashSet<Integer> hs = new HashSet<>();

    for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
    }
    int sizeOfSet = hs.size();
    int j=0;

    for(int i : hs){
        nums[j]=i;
        j++;
    }

    return sizeOfSet;
  }

  // #Optimal solution
  public int removeDuplicates(int[] nums) {
        
    int i=0;
    for(int j=1;j<nums.length;j++){
        if(nums[i] != nums[j]){
            i++;
            nums[i] = nums[j];
        }
    }
    return i+1;
   

}

}
