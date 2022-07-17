abstract class Class3{
	abstract void display();
}
class Class1 extends Class3{
	void display() {
		System.out.println("I am part of abstract class");
	}
	void diplay1() {
		System.out.println("Parent class");
	}
	
}
class Class2 extends Class1{
	void display1() {
		System.out.println("I am part of inheritance");
	}
}
class Class4{
	void run() {
		System.out.println("Method");
	}
	void run(int i) {
		System.out.println("overloading");
	}
	void run(int i,int j) {
		System.out.println("in java");
	}
}
public class Oops {

	public static void main(String[] args) {
		Class1 a=new Class1();
		a.display();
		Class2 b=new Class2();
		b.diplay1();
		Class4 c=new Class4();
		c.run();
		c.run(1);
		c.run(1, 2);

	}

}
