import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) {
		try {
			//File writing
			FileWriter filewriter=new FileWriter("FileJavatext.txt");
			String string="Java has file handling concepts";
			filewriter.write(string);
			filewriter.close();
			System.out.println("Data Successfully written");
			
			//File reading
			File file=new File("FileJavatext.txt");
			try (Scanner obj = new Scanner(file)) {
				while(obj.hasNextLine()) {
					String data=obj.nextLine();
					System.out.println("File reading: "+data);
				}
			} 
			
			//Appending to file
			 String data = " Completing file handling concept";
	         File f1 = new File("FileJavatext.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }
	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("Appending Done");
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e);
			e.printStackTrace();
		}
	}
}
