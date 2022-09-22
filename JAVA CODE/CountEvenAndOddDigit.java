public class CountEvenAndOddDigit {
    public static void main(String[] args) {
        int i = 123456789;
        int countEven = 0;
        int countOdd =0;
        while(i>0){
            int rem = i%10;
            
            if (rem%2==0) {
                countEven++;
               
            } else {
                countOdd++;
               
            }
            i =i/10;
        }
        System.out.println(countEven);
        System.out.println(countOdd);
    }
}
