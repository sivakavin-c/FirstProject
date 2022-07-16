
class ParameterizedConstructor{
	ParameterizedConstructor(int i,int j){
		int sum;
		sum=i+j;
		System.out.println(sum);
	}
}
class DefaultConstructor{
	DefaultConstructor(){
		System.out.println("1");
	}
}

public class Constructors {
	public static void main(String [] args) {
		DefaultConstructor obj=new DefaultConstructor();
		ParameterizedConstructor obj1=new ParameterizedConstructor(1,1);
	}
}
