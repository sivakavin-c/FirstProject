
public class Strings {

	public static void main(String[] args) {
		//String
		String s="I am String";
		System.out.println(s);
		
		//StringBuffer
		StringBuffer buffer=new StringBuffer("I am ");  
        buffer.append("StringBuffer");  
        System.out.println(buffer);  
        
        //StringBuilder
        StringBuilder builder=new StringBuilder("I am ");  
        builder.append("StringBuffer");  
        System.out.println(buffer);

	}

}
