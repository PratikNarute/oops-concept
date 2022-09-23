package Casting;

public class SuperClass 
{
	public void ArithmaticalOp()
	{
		System.out.println("addition");
	}
	
	public static void StaticMethod()
	{
		System.out.println("Static Method of Super Class");
	}
	
	
    public static void main(String[] args)
    {
    	// PRIMITIVE CASTING
    	
    	byte a=127;
    	short b =a;          // Implicit casting
    	System.out.println(b);
    	
    	short c=128;
    	byte d=(byte) c;  // Explicit casting
		System.out.println(d); // Range of byte [-128 to 127]
	}
	

}
