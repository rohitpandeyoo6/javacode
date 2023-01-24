package javacode;

import java.util.Arrays;

public class EquallityOfTwoArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,6};
		int b[]= {1,2,3,4,4,6};
		/*
		 * if (a.length==b.length) { System.out.println("arrays are equal"); } else {
		 * System.out.println("arrays ane not equal"); }
		 */
		System.out.println(Arrays.equals(a, b));
	}

}
