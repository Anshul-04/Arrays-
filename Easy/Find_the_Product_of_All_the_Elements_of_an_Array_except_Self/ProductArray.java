package Arrays.Find_the_Product_of_All_the_Elements_of_an_Array_except_Self;

import java.util.Arrays;

// Java Program to Find the Product of All the Elements of an Array


public class ProductArray {
    public static void main(String[] args) {
        int[] arr = {5,6,2,4,1};
        System.out.println("Original Array : "+Arrays.toString(arr));
        productArray(arr);        
    }

    public static void productArray(int[] arr){
        int  n =arr.length;
        int product = 1;
        for(int i=0;i<n;i++){
            product *= arr[i];
        }

        for(int i=0;i<n;i++){
            arr[i] = product/arr[i];
        }
        System.out.println("Product of Array except self is : \n"+Arrays.toString(arr));

    }
}
