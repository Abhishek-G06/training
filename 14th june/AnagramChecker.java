import java.util.*;

public class AnagramChecker {
    public static boolean areAnagram(String s1,String s2){
        s1 =s1.replaceAll("","").toLowerCase();
        s2 =s2.replaceAll("","").toLowerCase();

        if(s1.length() !=s2.length()){
            return false;
        }
        char[] charA1= s1.toCharArray();
        char[] charA2= s2.toCharArray();

        Arrays.sort(charA1);
        Arrays.sort(charA2);

        return Arrays.equals(charA1,charA2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        if(areAnagram(s1,s2)){
            System.out.println("String is Anagram.");
        }else{
            System.out.println("String is not Anagram.");
        }
    }    
}
