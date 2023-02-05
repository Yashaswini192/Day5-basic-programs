package Demo;
import java.util.Scanner;
public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter p value:");
		int p=s.nextInt();
		System.out.println("enter f value:");
		int f=s.nextInt();
		System.out.println("enter r value:");
		int r=s.nextInt();
		if(p>f && p>r) {
			System.out.println("p is largest number");
		}else if (f>p && f>r) {
			System.out.println("f is largest number");
		}else {
			System.out.println("r is largest number");
		}
		s.close();
	}

}
