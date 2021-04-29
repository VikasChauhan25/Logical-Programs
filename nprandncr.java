import java.util.Scanner;
public class nprandncr {
    public static int fact(int x)
    {
        if(x==0)
        {
            return 1;
        }
        else
        {
            return x*fact(x-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        System.out.println("Enter r value:");
        int r=sc.nextInt();
        System.out.println("nCr calculation: "+fact(n)/(fact(r)*fact(n-r)));
        System.out.println("nPr calculation: "+fact(n)/fact(n-r));

    }    
}
