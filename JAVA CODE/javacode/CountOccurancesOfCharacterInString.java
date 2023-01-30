package javacode;

public class CountOccurancesOfCharacterInString {

	public static void main(String[] args) {
		String str= "ROHITKUMARPANDEY";
		char x= 'R';
		int count = 0;
		for (int i = 0; i < args.length; i++) {
		
				if (str.charAt(i)==x) {
					count++;
					
				} else {

				}
			
		}System.out.println(count);

	}

}
