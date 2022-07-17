
public class TryCatch {

	public static void main(String[] args) {
		try {
			int a=12/0;
		}
		catch(Exception e) {
			System.out.println("Handled error is: "+e);
		}
        try {
        	int arr[]= {1,2,3,4,5};
        	System.out.println(arr[10]);       	
        }
        catch(Exception e) {
			System.out.println("Handled error is: "+e);
		}
	}

}
