package Demo;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int headcount=0; int tailcount=0;
		for(int i=1;i<=5;i++) {
		double flip=((Math.random()%10)%2);
		if (flip > 0.5) {
			headcount++;
			System.out.println("Heads");
		}else {
			tailcount++;
			System.out.println("Tails");
		}
	}
		if (headcount >= tailcount) {
			System.out.println("percentage of heads is higher");
		}else if (tailcount >= headcount) {
			System.out.println("percentage of tails is higher");
		}else {
			System.out.println("");
		}
	
  }
}
