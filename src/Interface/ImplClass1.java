package Interface;

public class ImplClass1 implements InterfaceClass
{
	
	
	  public void test()
	  {
		  System.out.println("testmethod of interface class");
	  }
	  public void publicmethod()
	  {
		System.out.println("publicmethod of interface class");  
	  }
	  public void abstractmethod()
	  {
		System.out.println("abstractmethod of interface class");	
	  }
		
	
	  
/*	  default void defaultmethod()                                   [interface is valid for only static&abstracts methods]
		{
			System.out.println("dafault method of interface class");
		}
		
*/			
		
	  
	public static void main(String[] args)
	{
		 ImplClass1 x = new ImplClass1();
		 System.out.println(x.a);
		// x.a=20;   [a variable is final variable]
		 
		  x.test(); 
		  x.publicmethod();
		  x.abstractmethod();
		 // x.staticmethod();     [we cannot call static method of interface with reference of implementation class name.]
		  x.defaultmethod();      
	}

}
