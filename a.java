public class a{
    public static void pattern(int n){
        for(int i = 0; i < 2*n; i++){
            int c = i > n ? 2*n - i : i; 
            
            for(int j = 0; j < c; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    public static void pattern1(int n){
        for(int i = 0; i < 2*n; i++){
            int c = i > n ? 2*n - i : i; 
            
            int space = n - c;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            
            for(int j = 0; j < c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
    
}