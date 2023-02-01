package Demo;

public class DemoProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double flip=((Math.random()%10)%2);
		if (flip == 1) {
			System.out.println("Heads");
		}else {
			System.out.println("Tails");
		}
	}
}
