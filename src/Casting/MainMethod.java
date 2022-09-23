package Casting;

public class MainMethod 
{
   public static void main(String[] args) 
   {
	   // NON PRIMITIVE CASTING
	SuperClass a=new SuperClass(); // object of superclass
	a.ArithmaticalOp();
	a.StaticMethod();
	
	System.out.println("========================================");
	
	SubClass1 b =new SubClass1();   // object of subclass
	b.ArithmaticalOp();
	b.StaticMethod();
	
	System.out.println("========================================");
	
	SuperClass cast =new SubClass1();  // Up casting
	cast.ArithmaticalOp();
	cast.StaticMethod();  //casting is not supported for static methods
	System.out.println("========================================");
	
	
	SubClass1 cast1=(SubClass1) new SuperClass();  // Down casting [It is not supported in java]
	cast1.ArithmaticalOp();
	
	System.out.println("========================================");
	
   }
}
