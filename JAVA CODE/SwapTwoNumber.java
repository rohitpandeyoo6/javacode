import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        try (// int a = 10;
                // int b = 20;
                // System.out.println("value of a and b before swapping:"+a+" "+b);
                // int t;
                // t = a;
                // a = b;
                // b = t;
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            System.out.println("Enter the value of b:");
            int b = sc.nextInt();
            int t;
            t = a;
            a = b;
            b = t;
            System.out.println("value of a and b after swapping:"+a+" "+b);
            //by using single statement
            //b= a+b-(a=b);
        }
       

    }
}
