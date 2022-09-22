import java.util.Scanner;

public class SwapTwoString {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string:");
             String s1 = sc.next();
             System.out.print("Enter second string:");
             String  s2 = sc.next();
             System.out.println("Before swapping value of s1 and s2 is:"+s1+" "+s2);
            //MY METHOD (NOT RECOMENDED)
            // String temp;
            // temp = s1;
            // s1 = s2;
            // s2 = temp;
            // System.out.println("After swapping value of s1 and s2 is:"+s1+" "+s2);
            


            //RECOMENDED METHOD
            String s = s1+s2;
            s2 = s.substring(0, s.length()-s2.length());
            s1 = s.substring(s2.length());
            System.out.println("After swapping value of s1 and s2 is:"+s1+" "+s2);
        }
    }
}
