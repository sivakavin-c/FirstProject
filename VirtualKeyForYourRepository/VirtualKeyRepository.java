package com.VirtualKeyForRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
class BusinessLevelOperations {

	//Bubble sort
	protected static String[] sortingFunction(String arr[], int size){
		String input = "";
		for(int i=0; i<size; i++){
			for(int j=1; j<(size-i); j++){
				if(arr[j-1].compareToIgnoreCase(arr[j])>0){
					input = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=input;
				}
			}
		}
		return arr;
	}
	
	//File listing
	protected static void listTheFiles() {
		
		int fileCount = 0;
	    ArrayList<String> filenames = new ArrayList<String>();
	
		File path = new File(System.getProperty("user.dir"));
		File[] listOfFiles = path.listFiles();
		fileCount = listOfFiles.length;
		
		
		System.out.println("Files in ascending order: ");
		for (int i = 0; i < fileCount; i++) {
		  if (listOfFiles[i].isFile()) {
		    filenames.add(listOfFiles[i].getName());
		  } 
		}
		
		String[] str = new String[filenames.size()];
		 
	    for (int i = 0; i < filenames.size(); i++) {
	        str[i] = filenames.get(i);
	    }
		
	    String[] sorted_file = sortingFunction(str, str.length);
		
		for(String currentFile: sorted_file) {
			System.out.println(currentFile);
		}

	}
	
	//File creation 
		protected static void createFile (String fileToCreate) {
			File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToCreate );
			
			try {
				if (file.createNewFile() ) {
					System.out.println("File Created!");
					System.out.println("Do you want to write something to this file: Y/N");
					Scanner sc=new Scanner(System.in);
					char s=sc.next().charAt(0);
					if(s=='Y') {
						 try {
						      FileWriter myWriter = new FileWriter( fileToCreate);
						      Scanner sc1=new Scanner(System.in);
						      System.out.println("Enter a message: ");
						      String line=sc1.nextLine();
						      myWriter.write(line);
						      myWriter.close();
						      System.out.println("Successfully wrote to the file.");
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }
					}
				} else {
					System.out.println("File already exists");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	//File delete 
	    protected static void deleteTheFile(String fileToDelete) {
		
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToDelete );
		
		if(file.exists()) {
			if ( file.delete() ) {
				System.out.println(fileToDelete+" deleted successfully");
			}
		} else {
			System.out.println("Sorry, File Not Found");
		}
	}
	
	//File search 
	    protected static void searchTheFile(String fileToSearch) {
        
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToSearch );
		
		//Check whether file exists or not.
		//If yes then display
		if(file.exists()) {
			System.out.println("Searched File found");
			Scanner sc=new Scanner(System.in);
			System.out.println("Do you want to read the file: Y/N");
			char s=sc.next().charAt(0);
			if(s=='Y'||s=='y') {
				try {
				      File myObj = new File(fileToSearch);
				      Scanner myReader = new Scanner(myObj);
				      while (myReader.hasNextLine()) {
				        String data = myReader.nextLine();
				        System.out.println(data);
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
			}
		} 
		else {
			System.out.println("Sorry, File Not Found");
		}	PrintWriter pw;  
        try {  
            pw = new PrintWriter(fileToSearch);  
            pw.println("saved");  
        }    
        catch (FileNotFoundException e) {     
            System.out.println(e);  
        } 
	}
}

public class VirtualKeyRepository  {

	public static void main(String[] args) throws IOException {
		int choose=0, choice=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println(" Welcome to Virtual Key for Repository! ");
		System.out.println(" Lockers Pvt. Ltd. ");
		System.out.println("--------------------------------------------");
	
		while(true)
		{
			System.out.println("Pick one of the options below :");
			System.out.println("1. Retrieving the file names in an ascending order");
			System.out.println("2. Business-level operations: like add,delete and search");
			System.out.println("3. Close the Application");
			System.out.println("Enter the choice:");
			try{    
				choose = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Exception occurred: "+e);  
             }         
			
			switch(choose)
			{
			case 1:
				BusinessLevelOperations.listTheFiles();
				break;
			case 2:
				
					System.out.println("Pick one of the options below :");
					System.out.println("1. To add a File");
					System.out.println("2. To delete a File");
					System.out.println("3. To search for a File");
					System.out.println("Enter the choice:");
					try{    
						 choice = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Exception occured: "+e);  
	                  }          
					switch(choice)
					{
					case 1:
						//Creation of a file
						System.out.println("Input the name of a file to be created: ");
						String CreateFile = sc.next();
						BusinessLevelOperations.createFile(CreateFile);
						break;
						
					case 2:
						//deletion of a file
						System.out.print("Input the name of a file to be deleted: ");
						String DeleteFile = sc.next();
						BusinessLevelOperations.deleteTheFile(DeleteFile);
						break;
					case 3:
						//Search for a file
						System.out.println("Input the name of a file to be searched: ");
						String SearchFile = sc.next();
						BusinessLevelOperations.searchTheFile(SearchFile);
						break;
						
				default:
						//In case of invalid input
						System.out.println("\nInvalid Input,Select within the range of 1-3");
						break;
				}
			
					break;
			case 3:
				
				//Exiting the application
				sc.close();
				System.out.println("\nClosing the application....\nThanks for using the Application");
				System.exit(1);
				break;
			
			default:
				//In case of invalid input
				System.out.println("\nInvalid Input, Select within the range of 1-3");
				break;
			
			}
		}
	}
}
