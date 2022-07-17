import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File file=new File("Javatext.txt");
			if(file.createNewFile()) {
				System.out.println("File created: "+file.getName());
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(Exception e) {
			System.out.println("Error occured: "+e);
			e.printStackTrace();
		}

	}

}
