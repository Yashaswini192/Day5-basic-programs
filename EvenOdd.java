package Demo;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number:");
		int a = s.nextInt();
		if(a % 2 == 1) {
			System.out.println("odd number");
		}else {
			System.out.println("even number");
		}
		s.close();
	}

}
