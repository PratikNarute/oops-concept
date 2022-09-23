package Keywords;

public class Super extends This
{
   int a=30;
   
   public void demo() 
   {
     System.out.println(super.a);
   
	   
   }
   
   public static void main(String[] args) 
   {
	   Super  ref=new Super();
	   ref.demo();
	
}
}
