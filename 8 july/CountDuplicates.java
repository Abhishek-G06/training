import java.util.Scanner;

public class CountDuplicates {
    public class CountArrayDuplicates1{
        private static Scanner sc;
        public static void main (String[] args){
            
            int Size, i, j, dup_count = 0;

            sc = new Scanner (System.in);

            System.out.print ("\nPlease Enter the Duplicate Array size : ");
            Size = sc.nextInt ();
            
            int [] Dup_Count_arr = new int[Size];
            
            System.out.format ("InEnter Duplicate Array ®d elements : ", Size);
            
            for(i = 0; i < Size; i++){
                Dup_Count_arr[i] = sc.nextInt ();
            }    
            for(i = 0; i < Size; i++){
                for(j = i+1; j < Size; j++){
                    if(Dup_Count_arr[i]==Dup_Count_arr[j]){
                        dup_count++;
                        break;
                    }
                }
            }
            System.out.println("\nThe Total Number of Duplicates = " + dup_count);
        }
    }
}                    