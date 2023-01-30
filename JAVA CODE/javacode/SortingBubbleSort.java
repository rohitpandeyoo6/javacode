package javacode;

import java.util.Arrays;

public class SortingBubbleSort {

	public static void main(String[] args) {
		int []a= {4,5,10,44,22,2};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				} 
			}System.out.print(a[i]+" ");
		}System.out.print(Arrays.toString(a)+" ");
		 
		
	}

}
