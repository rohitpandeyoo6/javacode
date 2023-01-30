package javacode;

public class RemoveJunkElement {

	public static void main(String[] args) {
		String str= "A@gfh5#jh%";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
