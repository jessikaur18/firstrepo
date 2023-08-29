package taxrecords;

public class incometaxreport {

		
		public static void main(String[] args) {
			int salary=2501;
			int bracketa=2500;
			int bracketb=5000;
			int bracketc=10000;
			double taxamount=0;
			
			if (salary>bracketa && salary<=bracketb)
				{
					taxamount= salary*.03;
				
				}
				else if (salary>bracketb && salary<=bracketc)
				{
					taxamount= salary*.05;
			}
				else 
				{
					taxamount= salary*.07;
					}
					
					
			System.out.println("tax amount:"+(taxamount));
			


				
					
		}
		}
		




