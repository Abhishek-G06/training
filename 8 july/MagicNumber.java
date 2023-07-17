import java.util.Scanner;  

public class MagicNumber{
    public static void main(String args[]){
        //int n, r = 1, n, sum = 0;  
          
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number you want to check: ");  
     
        int n = sc.nextInt();    
        
        //outer while loop  
        while (n > 9){               //while(number > 0 || sum > 9)  
            int sum = 0, r = 1;
            //inner while loop      
            while (n > 0){

                //determines the remainder      
                r = n % 10;   
                
                sum += r;  
                
                //divides the number by 10 and removes the last digit of the number  
                n /= 10;     
            }  
            n = sum;  
            sum = 0;  
        }  
        if (n == 1){
            System.out.println("The given number is a magic number.");  
        }  
        else {
            System.out.println("The given number is not a magic number.");  
        }
        sc.close();  
    }  
} 