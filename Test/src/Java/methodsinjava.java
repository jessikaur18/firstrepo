package Java;

public class methodsinjava {

	

	public static void method()
	
	{
	
	System.out.println("This is a static method");
			
	}
	

	public void method1()
	
	{
		System.out.println("this is a non static method");
	
		method();

	}
	 
	
	
	public static void method2() {
	
		
		System.out.println("this is a static method");
	
	}
	
  
	public void method3() {
		
		
		System.out.println("Calling of Static Method inside Non Static Method");
		
	}
  
     public void method5() {
		
		
		System.out.println("Calling of Non Static Method inside Non Static Method");
		
		methodsinjava obj1= new methodsinjava();
		obj1.method3();
	
		
	}
  
	
	
	public static void method4() {
		
		System.out.println("Calling of Static Method inside Static Method");	
		
		  methodsinjava obj1 = new methodsinjava();
			
			obj1.method3();	
		
	}
	
    public static void main(String[] args) {

    	//Calling of Static Method inside Main Method
	method();
	
	
	//Calling of Non-Static Method inside Main Method
	methodsinjava obj= new methodsinjava();
	
	obj.method1();
    method2();
    method4();
    
	



	
	
	
	
	
	
	
	
	
	
}






}
