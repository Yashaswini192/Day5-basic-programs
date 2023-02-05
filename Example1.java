package Demo;

public class Example1{
	
	public int s=5; //public access modifier
	int g=4;         //default access modifier
	// values or variables inside the private cannot be accessed outside the method
	//scope of variables inside the private lies inside the method  
	private int r=7;  
    protected int j=8;
	
	public static void main(String[] args) {
		Example1 obj=new Example1();
		System.out.println(obj.s);
		System.out.println(obj.g);
		System.out.println(obj.r);   
		System.out.println(obj.j); 
	}
}
 