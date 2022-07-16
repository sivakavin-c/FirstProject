class OuterClass1 {
  int x = 10;

  static class InnerClass1 {
    int y = 5;
  }
}
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}
public class InnerClasses {
	public static void main(String[] args) {
		//inner class
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	    
	    //static inner class
	    OuterClass1.InnerClass1 myInner1 = new OuterClass1.InnerClass1();
	    System.out.println(myInner1.y);
	  }
}
