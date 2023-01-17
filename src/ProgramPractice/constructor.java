package ProgramPractice;

public class constructor 
{
 
		int rollno;  
		String name,course;  
		float fee;  
		
	
		constructor(int rollno,String name,String course,float fee)
		{  
			//this(rollno,name,course);//reusing constructor  
			this.fee=fee;  
		}  
		
		void display()
		{
			System.out.println(rollno+" "+name+" "+course+" "+fee);
		}  
}  
		 
			
	


