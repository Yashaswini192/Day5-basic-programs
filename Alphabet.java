package Demo;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("enter a Alphabet:");
		char ch = x.next().charAt(0);
		
		if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
		x.close();
	}

}
