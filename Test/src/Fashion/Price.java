package Fashion;

public class Price {

	
	public static void main (String[] args) {
		    Items d =new Items("pajamas",50,25);
			//Items d =new Items("pajamas",50);
			Items e =new Items("tops",50);
			Items f =new Items("shirts",60);
			Items g =new Items("pants",70);
			Items h =new Items("dresses",100);
			Items i =new Items("sweaters",80);
			Items j =new Items("jackets",200);
			Items k =new Items("coats",500);
			System.out.println(d.Name +" " + d.Price);
			System.out.println(e.Name +" " + e.Price);
			System.out.println(f.Name +" " + f.Price);
			System.out.println(g.Name +" " + g.Price);
			System.out.println(h.Name +" " + h.Price);
			System.out.println(i.Name +" " + i.Price);
			System.out.println(j.Name +" " + j.Price);
			System.out.println(k.Name +" " + k.Price);
			
			d.discount(d.percent, d.Price);
			e.discount(50, e.Price);
            f.discount(30, f.Price);
			
    }
	}
