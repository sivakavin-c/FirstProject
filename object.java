class Box{
	void box() {
		System.out.println("parent");
	}
}
class Box1 extends Box{
	@Override
	void box() {
		System.out.println("child");
	}
}

public class object {

	public static void main(String[] args) {
		Box1 b=new Box1();
	    b.box();
	}

}
