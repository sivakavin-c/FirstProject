import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try {
			File file=new File("Javatext.txt");
			Scanner obj=new Scanner(file);
			while(obj.hasNextLine()) {
				String data=obj.nextLine();
				System.out.println(data);
			}
			obj.close();
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e);
			e.printStackTrace();
		}
		}

	}


