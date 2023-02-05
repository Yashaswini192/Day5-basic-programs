package Demo;
import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		/*System.out.println("enter base:");
		int base=s.nextInt();
		System.out.println("enter exponent:");
		int exponent=s.nextInt();
		double result=Math.pow(base, exponent);
		System.out.println(""+result);
		s.close();*/
		
		int a=2;
		System.out.println("enter n value:");
		int N=s.nextInt();
		double result=Math.pow(a, N);
		for(int i=0;i<=N;i++);
		System.out.println(""+result);
	}
}
