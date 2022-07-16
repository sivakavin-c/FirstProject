
public class JavaTypeCasting {

	public static void main(String[] args) {
		// Implicit type casting
		
		byte Byte=127;
		short Short=Byte;
		int Integer=Short;
		long Long=Integer;
		float Float=Long;
		double Double=Float;
		
		System.out.println("The byte value is "+Byte);
		System.out.println("The short value is "+Short);
		System.out.println("The integer value is "+Integer);
		System.out.println("The long value is "+Long);
		System.out.println("The float value is "+Float);
		System.out.println("The doble value is "+Double);
		
		// Explicit type casting
		
        double DOUBLE=50.0;
        float FLOAT=(float)DOUBLE;
        long LONG=(long)FLOAT;
        int INTEGER=(int)LONG;
        short SHORT=(short)INTEGER;
        byte BYTE=(byte)SHORT;
        
        System.out.println("The double value is "+DOUBLE);
		System.out.println("The float value is "+FLOAT);
		System.out.println("The long value is "+LONG);
		System.out.println("The integer value is "+INTEGER);
		System.out.println("The short value is "+SHORT);
		System.out.println("The byte value is "+BYTE);
	}

}
