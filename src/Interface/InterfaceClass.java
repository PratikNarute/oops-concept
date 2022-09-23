package Interface;

public interface InterfaceClass 
{
	 int a=10;                    //  public, static, final
	
	void test();                       // public, abstract

	public void publicmethod();
	public void abstractmethod();
	
	
	
	
	 // jdk 1.8
	 static void staticmethod()
	{
		System.out.println("static method of interface class");
	}
	
	 
	public default void defaultmethod()
	{
		System.out.println("dafault method of interface class");
	}
	
	 
	 
	 
    public static void main(String[] args)
    {
       // InterfaceClass z= new InterfaceClass();   •	Constructor concept are not present inside the interface; therefore, we cannot create object of interface.
    	
    	int a=20;
    	System.out.println(a);
    	
    	InterfaceClass.staticmethod();
    	//InterfaceClass.defaultmethod(); no valid because only static&abstract methods only allowed
    	
	}
	 
} 

