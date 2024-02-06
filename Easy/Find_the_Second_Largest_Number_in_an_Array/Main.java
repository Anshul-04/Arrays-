package Arrays.Find_the_Second_Largest_Number_in_an_Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,6,2,4,1};
        System.out.println("Original Array : "+Arrays.toString(arr));
         
        int largest= Integer.MIN_VALUE;
        int second_largest= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

           if(arr[i]>largest ){
             second_largest = largest;
             largest = arr[i];
           }
           else if(arr[i]!=largest && arr[i]>second_largest){
               second_largest = arr[i];
           }
        }
        System.out.println("Second Largest Number in array is  : "+ second_largest);
    }
}
