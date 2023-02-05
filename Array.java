package Demo;

public class Array {
	
	static int[][] x = {{1,3,5},{2,4,6},{3,6,9},{4,8,12}};
	
	public static void main(String[] args) {
		
		Array s = new Array();
		for(int i=0;i<s.x.length;i++) {
			for (int j=0;j<s.x[i].length;j++) {
				System.out.print(s.x[i][j]+" ");
				}
			System.out.println(" ");
		}
	}

}
