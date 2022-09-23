package Interface;

public  class ImplClass2 extends ImplClass1
{


	  public void test()
	  {
		  System.out.println("testmethod of interface class");
	  }
	  
	  
 public static void main(String[] args)
  {
	  
	ImplClass2 y=new ImplClass2();
	System.out.println(y.a);      
	
	  y.test(); 
	  
	
  }

}