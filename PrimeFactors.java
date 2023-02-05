package Demo;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int N=s.nextInt();
		for(int i=1;i * i <= N; i++) {
			if(i * i == N ) {
			System.out.println("prime factors are:" +i);
			}
			else {
				System.out.println(" ");
			}
	    s.close();
	}
  }
}
