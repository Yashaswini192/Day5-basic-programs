package Demo;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if loop
		double  f=11;
		if(f % 2 == 1) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
		
		//switch case loop
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int c=s.nextInt();
		switch (c) {
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("February");
			break;
		case 3 :
			System.out.println("march");
			break;
		default :
			System.out.println("enter a valid number");
		}s.close();
		
		//for loop
		int v=10;
		for(int i=0;i <= v;i++) {
			System.out.println(" "+i);
		}
	}
}
