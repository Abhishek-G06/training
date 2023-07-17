public class EquilibriumIndex {  
    
    public static int eqbmindex(int array[], int n){    
        int lsum, rsum;  
        
        for (int i = 0; i < n; ++i){     
            lsum = 0;  

            for (int j = 0; j < i; j++) 
                lsum += array[j];  
                rsum = 0;  
        
                for (int j = i + 1; j < n; j++)  
                    rsum += array[j];  
                
                if (lsum == rsum)  
                    return i;    
        }                
        return -1;
    }        
    public static void main(String[] args){  
        int array[] = {10, 2, 8, 4, -2, 0};  
        int arraysize = array.length;  
        System.out.print("Equilibrium Index is: ");  
        System.out.println(eqbmindex(array, arraysize));  
    }  
}