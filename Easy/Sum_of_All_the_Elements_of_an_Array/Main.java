package Arrays.Sum_of_All_the_Elements_of_an_Array ;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        int[] arr = {5,6,2,4,1};
        System.out.println("Original Array : "+Arrays.toString(arr));       
        sumArray(arr);        
    }

    public static void sumArray(int[] a){
        int n = a.length;
        int sum = 0;

        for(int i=0 ; i<n ; i++){
            sum += a[i];
        }

        for(int i=0 ; i<n ; i++){
            a[i] = sum - a[i];
        }

        System.out.println("Sum of Array except self : \n"+ Arrays.toString(a));
    }
    
}
