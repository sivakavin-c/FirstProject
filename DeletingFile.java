import java.io.File;

public class DeletingFile {
	public static void main(String[]args) {
		try {
			File file=new File("Javatext.txt");
			if(file.delete()) {
				System.out.println("Deleted file: "+file.getName());
			}
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e);
			e.printStackTrace();
		}
	}
	
}
