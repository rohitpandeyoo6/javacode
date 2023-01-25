package javacode;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int a[]= {4,55,78,4,55};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				}
				
			}
		}
	}

}
