import org.omg.CORBA.PUBLIC_MEMBER;

public class Getit 
{

	
	  public void m3() 
      {
    	  System.out.println("m1 call ");  
      }	 
	public void m4() 
      {
    	  System.out.println("m1 call "); 
      }
	public static void main(String[] args) 
	{
		System.out.println("Hello");
    
		Getit get = new Getit();
		get.m3();
		get.m4();

	}

}
