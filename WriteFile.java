import java.io.FileWriter;

public class WriteFile {
	public static void main(String args[]) {
		try {
			FileWriter filewriter=new FileWriter("Javatext.txt");
			String string="Java has file handling concepts";
			filewriter.write(string);
			filewriter.close();
			System.out.println("Successfully written");
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e);
			e.printStackTrace();
		}
	}
}
