package items;


public class pricecalc {
	
	
	
	
public static void main(String[] args) {

 item item1 = new item(1000,"tv");
 //item1.price=1000;
 //item1.name="tv";
 
 item1.discount(10,item1.price);
 
 item item2= new item(800,"dishwasher");
 //item2.price=900;
 //item2.name="dishwasher";
 
 item2.discount(20,item2.price);
 
 item item3=new item(900,"oven");
 item3.discount(25,item3.price);
 
 
 
 
 
		 
 
 
 
	
	
}

}
