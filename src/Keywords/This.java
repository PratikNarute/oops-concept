package Keywords;

public class This 
{
   int a=10;
   
   public void nonstaticmethod()
   {
	   int a=20;
	   System.out.println(this.a);
   }
   
   public static void main(String[] args) 
   {
	   This ref=new This();
	   ref.nonstaticmethod();
	
}
}
