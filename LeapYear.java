package Demo;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a 4 Digit number:");
		int x = d.nextInt();
		if((x % 400 == 0) || (x % 4 == 0)) {
			System.out.println("leap year");
		}else {
			System.out.println("not a leap year");
		}
		d.close();
	}

}
