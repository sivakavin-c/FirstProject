class NewMethod{
	public void display() {
		//outer method
		System.out.println("I am outer method");
	}
}
public class Methods {
	// inner method
	static void display() {
		System.out.println("I am method with static");
	}
	
	void display1(){
		System.out.println("I am method without static");
	}
	public static void main(String [] args) {
		//accessing inner method without static
		Methods m=new Methods();
		m.display1();
		
		//accessing inner method with static
		display();
		
		//accessing outer method
		NewMethod n=new NewMethod();
		n.display();
	}
}
