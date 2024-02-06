package Arrays.Find_the_Largest_Number_in_an_Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,6,2,4,1};
        System.out.println("Original Array : "+Arrays.toString(arr));
         
        int larg = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>larg){
            larg = arr[i];
           }
        }
        System.out.println("Largest Number in array is  : "+ larg);
    }
}
