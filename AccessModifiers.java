class Default{
	int l=1;
}
class Protected{
	protected int k=1;
}
class Private{
	private int j;
	public int getNumber() {
		return this.j;
	}
	public void setNumber(int j) {
		this.j=j;
	}
}
class Public{
	public int i=1;
}
public class AccessModifiers {

	public static void main(String[] args) {
		Public a=new Public();
		System.out.println("Public modifier: "+a.i);
		
		Private b=new Private();
		b.setNumber(1);
		System.out.println("Private modifier: "+b.getNumber());
		
		Protected c=new Protected();
		System.out.println("Protected modifier: "+c.k);
		
		Default d=new Default();
		System.out.println("Default modifier: "+d.l);
	}

}
