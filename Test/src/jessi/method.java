package jessi;

public class method {
	
	public static void main(String[] args) {
		int salary=280000;
		int a=250000;
		int b=750000;
		int c=1000000;
		double tax=0;
		
	if (salary>a && salary<b)
	{
		tax= salary*.03;
		
		System.out.println("tax is " + tax + " Remaining Salary : " + (salary-tax));
			
	} 
	else if(salary>b && salary<c)
	{
		System.out.println(salary*=.05);
	}
	else if(salary>c)
	{
		System.out.println(salary*=.07);	
		
	}
	
	
		
			
		}
	
  
	}
	


