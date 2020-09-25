package com.test.pkg;

public class ExceptionHandling {
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Hello World....!");
			int i = 1/0;
			System.out.println("Completed");
	
	}
		catch(Exception exp){
			System.out.println("im in the catch block");
			System.out.println("message is : "+exp.getMessage());
			System.out.println("Cause i : "+exp.getCause());
			
		}
		finally {
			System.out.println("Im inside the finally block");
		}
			
		}

}
