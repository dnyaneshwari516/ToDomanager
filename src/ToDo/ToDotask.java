package ToDo;
import java.util.Scanner;

public class ToDotask {
	public static void main(String[] args) {
		System.out.println("Welcome to Todo Manager!\n");
		System.out.println("Please Enter Your Name:\n");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		System.out.println("hello " +name);
		
		System.out.println("Please Enter 5 tasks for the day:\n");
		String task1 = in.next();
		String task2 = in.next();
		String task3 = in.next();
		String task4 = in.next();    
		String task5 = in.next();
		
		
		
		System.out.println("Enter 1 to Display your tasks in Increasing and 0 to Decresing order:\n");
	    int num  = in.nextInt();
		if (num==1)
		         {
			      System.out.println("Your tasks in Increasing order");
			      System.out.println("" +task1);
			      System.out.println("" +task2);
			      System.out.println("" +task3);
			      System.out.println("" +task4);
			      System.out.println("" +task5);
	             }
		         
			else if(num==0) 
			     {
				  System.out.println("Your tasks in decresing order");
				  System.out.println("" +task5);
				  System.out.println("" +task4);
				  System.out.println("" +task3);
				  System.out.println("" +task2);
				  System.out.println("" +task1);
			     }
		
		
		System.out.println("Are tasks repeated?");  
	       
		
		if(task1==task2||task1==task3||task1==task4||task1==task5) 
	          {
	        	System.out.println("" +task1);
	          }
		else if(task1==task2||task2==task3||task2==task4||task2==task5)
              {
      	        System.out.println("" +task2);
              }

		else if(task1==task4||task2==task4||task3==task4||task4==task5)
  	  {
		   System.out.println("" +task4);
        }

		else if(task1==task5||task5==task2||task3==task5||task4==task5)
              {
	           System.out.println("" +task5);
              }
	        else
	        	{
	        		System.out.println("no task is repeated");
	        	}
	
		
			     
			
	
	}

			
	   

}


