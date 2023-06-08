import java.util.*;
class Kaprekar
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int p = 0;
        int digit=0,sq,sum=0;
        sq = num*num;
        p=sq;
        while(sq>0)
        {
            digit++;
            sq=sq/10;
        }
        int k=(int)Math.pow(10,(digit/2));
        while(p>0)
        {
            sum=sum+(p%k);
            p=p/k;
        }
        if(sum==num){
        System.out.println("Is a kaprekar number");
        }
        else{
        System.out.println("Is not a kaprekar number");
        }
    }
}