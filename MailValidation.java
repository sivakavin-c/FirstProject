import java.util.*;

public class MailValidation {

	public static void main(String[] args) { 
	  ArrayList<String>email=new ArrayList<String>();
	  email.add("abc@gmail.com");
	  email.add("def@gmail.com");
	  email.add("ghi@gmail.com");
	  email.add("jkl@gmail.com");

	 
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter mail to validate:");
		 String sr=sc.next();
		 boolean ans=email.contains(sr);
		 if(ans)
			 System.out.println("Mail id "+sr+" found successfully at "+ (email.indexOf(sr)+1)+ "th position");
		 else
			 System.out.println("Mail id not found!!");
	}
	 
	}
}


