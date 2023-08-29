package items;


public class item {

	int price;
	String name;
	
public void discount (int percent, int price)
{
	int disc=percent*price/100;
	
	
	System.out.println(name+ "  " + disc);
	
		
}
public item (int p, String n) {
	this.price=p;
	this.name=n;
		
	
}
	
}
