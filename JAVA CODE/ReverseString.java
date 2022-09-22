import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string value:");
            String s = sc.nextLine();

            //Using String Buffer class
     /*StringBuffer sb = new StringBuffer(s);
            StringBuffer rev = sb.reverse();*/

            //Using Concatination method
      /* int len = s.length();
            String rev ="";
            for(int i = len-1; i>=0;i--){
               rev = rev+ s.charAt(i);
            }*/
            
            //Using  character array method
            char a[] = s.toCharArray();
            int len = s.length();
            String rev = ""; 
            for(int i = len-1; i >=0; i--){
                rev = rev+a[i];
            }

            System.out.println("Reverse of String is:"+rev);
        }
    
    }
    }