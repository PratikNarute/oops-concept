package Abstract;

public class ConcreteClass extends AbstractClass
{
	
	  public void AbstractClass()
	  {
		  System.out.println("this is abstract class");
	  }
	  public void AbstractClass1()
	  {
		  System.out.println("this is abstract class 1");
	  }

	  
		
		
    public static void main(String[] args) 
    {
		
    	
    	ConcreteClass x = new ConcreteClass();
    	x.AbstractClass();
    	x.AbstractClass1();
		x.protectedmethod();
		
    	
    	
    	
	}
	

	
	

}
