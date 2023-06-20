// import java.util.Scanner;

public class ArraySumComparison{
    public static void main(String[] args){
                                            // Sacnner sc = new Scanner(System.in);     (when taking input from user)
        int[] arr1 = {1,2,3,4,5};           
        int[] arr2 = {5,5,3,2,1};           

        int s1 = 0;     // storing sum of First array
        int s2 = 0;     // storing sum of Second array
        
        // for loop
        for(int i=0; i <arr1.length;i++){
            s1 += arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            s2 += arr2[i];
        }
        /* 
        *  enhanced for loop
        
        for(int num : arr1){
            s1 += num;   
        }

        for (int num : arr2) {
            s2 += num;
        }
        */

        System.out.println(s1);
        System.out.println(s2);
        
        // comparison to check whether array is same or not
        if(s1 == s2){
            System.out.println("Sum of element of Arrays is same.");    
        }else {
            System.out.println("Sum of element of Arrays is not same.");
        }
    }
}