package Abstract;


public abstract class AbstractClass
{
   public abstract void AbstractClass();
   public abstract void AbstractClass1();
   
   
   public static void staticmethod()
   {
	  System.out.println("Public-staticmethod"); 
   }
   
   
   protected static void protectedmethod()
   {
	 System.out.println("protected-staticmethod");  
   }
   
	
	

   
   public static void main(String[] args) 
   {
	
    AbstractClass.protectedmethod();
    AbstractClass.staticmethod();
    
//System.getProperty("webdriver.chrome.driver","C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
	

   
   }
}
