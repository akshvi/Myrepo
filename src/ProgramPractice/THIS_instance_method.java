package ProgramPractice;

import java.util.Scanner;

public class THIS_instance_method 
{
		   private String name;
		   
		   public String getName() 
		   {
		      return name;
		   }
		   public void setName(String name)
		   {
		      this.name = name;
		      
		   }
		   public void display()
		   {
		      System.out.println("name: "+this.getName());
		   }
		   public static void main(String args[]) 
		   {
			   THIS_instance_method obj = new THIS_instance_method();
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the name of the student: ");
		      String name = sc.nextLine();
		      obj.setName(name);
		      obj.display();
		   }
		}

	


