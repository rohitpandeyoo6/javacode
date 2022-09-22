import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        //Using For Loop
          //int i = 1234;
         /* int rev = 0;
         for(int i = 1234;i!=0;i=i/10){
           int rem = i%10;
           rev = rev*10+rem;
         } */


        //Using While loop(Most Preferable)
         /*int rev = 0;
         while(num != 0){
          rev = rev*10 + num%10;
          num = num/10;
         }*/

        //Using String buffer class
   /* StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();*/


  //Using string builder class
  StringBuilder sbl = new StringBuilder();
  sbl.append(num);
  StringBuilder  rev = sbl.reverse();
         System.out.println("Reverse number is:"+rev);
      }
    }
}