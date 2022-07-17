interface Demo{
	default void display()   
	{   
	System.out.println("The dispaly() method invoked");   
	}   
}
interface Demo1 extends Demo{
}
interface Demo2 extends Demo{
	
}
public class DiamondProblem implements Demo1,Demo2 {
	public static void main(String [] args) {
		DiamondProblem obj=new DiamondProblem();
		obj.display();
	}
}
