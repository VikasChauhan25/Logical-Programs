import java.util.*;
public class pelindrom {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbert for checking pelindrom:");
        int n=sc.nextInt();
        int rev=0,rem=0,x;
        x=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(x==rev)
        {
            System.out.println("Palindrom number.");
        }
        else
        {
            System.out.println("Not Palindrom number");
        }
    }
    
}
