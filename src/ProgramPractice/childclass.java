package ProgramPractice;

public class childclass extends parentclass 
{
	int[] numbers= {9,3,5,7,2,8,6,1,4,0};
	     
	public static void main(String[] args)
	
	{

		 parentclass ch=new parentclass();
		 System.out.println("Descending order:");
		 ch.descending();
		  
	      System.out.println("Ascending order:");
	      ch.ascending();

	}

	
}
