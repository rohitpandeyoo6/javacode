package javacode;

public class MaxAndMinValueInArray {

	public static void main(String[] args) {
		int a[]= {20,15,3,66,8,440};
//		int min=a[0];
//		for (int i = 1; i < a.length; i++) {
//			 if (min>a[i]) {
//				min=a[i];
//			} 
//		}System.out.println(min);
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (max<a[i]) {
				max=a[i]; 
			}
			
		}System.out.println(max);
		
	}

}
