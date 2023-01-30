package javacode;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String str ="Rohit Kumar Pandey";
		str =str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
