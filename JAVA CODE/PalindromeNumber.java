import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number :");
            int i = sc.nextInt();
            int rev = 0;
            for(; i !=0; i=i/10){
                rev = rev*10 + i%10;
               
            }
            if (rev==i) {
                System.out.println("palindrome Number");  
              } else {
                  System.out.println("Not a Palindrome Number");
              }
        }
        
        
    }
}
