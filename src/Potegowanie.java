
public class Potegowanie {
	
	public static void main (String args[]) {
		
	}
	
	public static int potega(int podstawa , int potega) {
		
		int wynik = 1; 
		
		for (int x= 0; x<potega; x++)
		{
			
			wynik = wynik * podstawa;
			
		}
			
		return wynik;
	}
}
