package Fashion;

public class ClothingStore {

	
	//Defining Static 

	public static void jeans()
	{
		System.out.println("jeans");	
	}
	
	public static void dresses()
	{
		System.out.println("dresses");	
	}
	
    public static void shirts() {
	
    	System.out.println("shirts");
    }
    public static void tops() {
    	
    	System.out.println("tops");
    }
    public static void shorts() {
    	
    	System.out.println("shorts");
    }
    public static void trousers() {
    	
    	System.out.println("trousers");
    }
    public static void swimsuits() {
    	
    	System.out.println("swimsuits");
    }
    public static void sweaters() {
    	
    	System.out.println("sweaters");
    }
    public static void jackets() {
    	
    	System.out.println("jackets");
    }
    public static void coats() {
    	
    	System.out.println("coats");
    	System.out.println();
    }
    
    //StaticVariables 
    //public static int 
    

    
    
       int jeans=100;
    
    //public static int dresses=180;
    //public static int shirts=60;
    //public static int tops=80;
    //public static int shorts=50;
    //public static int trousers=70;
    //public static int swimsuits=120;
    //public static int sweater=80;
    //public static int jackets=220;
    //public static int coats=520;
    
  
    
    //NonStaticVariable
    
    public int hats=20;
    public int belts=50;
    public int sunglasses=250;
    public int scarves=50;
    public int jewelery=90;
    
    
    
    //System.out.println(hats);
    
    
    
    
    
    //Defining of Non Static
    
    public void hats() {
    	
    	System.out.println("hats");
    }
    public void belts() {
    	
    	System.out.println("belts");
    }
    public void sunglasses() {
    	
    	System.out.println("sunglasses");
    }
    public void scarves() {
    	
    	System.out.println("scarves");
    }
    public void jewelery() {
    	
    	System.out.println("jewelery");
    	System.out.println();
    }
    
    //Calling of Static and NonStatic in Static 
    
    public static void clothes() {
	
    	jeans();
    	dresses();
    	shirts();
    	tops();
    	shorts();
    	trousers();
    	swimsuits();
    	sweaters();
    	jackets();
    	coats();
    	
    	ClothingStore categories = new ClothingStore();
    	categories.hats();
    	categories.belts();
    	categories.sunglasses();
    	categories.scarves();
    	categories.jewelery();
	}
    
    //Calling of Static and NonStatic in NonStatic 

    public void Accessories() {
    	
    	hats();
    	belts();
    	sunglasses();
    	scarves();
    	jewelery();
    	
    	jeans();
    	dresses();
    	shirts();
    	tops();
    	shorts();
    	trousers();
    	swimsuits();
    	sweaters();
    	jackets();
    	coats();
    }
    	
        //Calling of Static and NonStatic in Main
  

    	public static void main (String[] args) {
    		
    		clothes();
    		ClothingStore all = new ClothingStore();
    		all.Accessories();
    		
    		//int jeans=110;
    		
    		//System.out.println("jeans");
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    
}
