package Fashion;

public class Items {
	
	String Name;
	int Price;
	int percent;
	
public Items(String Name1,int Price1)
	{
		this.Name= Name1;
		this.Price=Price1;
			
		
		
	}
public Items(String Name1,int Price1,int percent1)
{
	this.Name= Name1;
	this.Price=Price1;
	this.percent=percent1;
	
}
public void discount(int percentage,int price) {
	
	int afterdiscount;
	afterdiscount=price-(price*percentage/100);
	
	System.out.println(afterdiscount);
	
	
}

	//public static void main (String[] args) {
	
	//	Items d =new Items();
		//System.out.println(d.Name);
		
	//}
		
	}


