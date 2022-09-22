import java.util.Scanner;

public class PalindromeString{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String:");
            String  str = sc.nextLine();
            String org_str = str;
            String rev ="";
            int len = str.length();
           
            // StringBuffer sb = new StringBuffer(str);
            // sb.reverse();
            // String rev = sb.toString();
            for(int i =len-1; i>=0; i--){
                rev = rev+ str.charAt(i);
            }
            if (org_str.equals(rev)) {
                System.out.println("Palinderome String");
            } else {
                System.out.println("Not Palinderome String");
            }
        
        }
    }
}