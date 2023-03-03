public class Potencia {
	public static void main (String [] args){
	
	
	int base=0;
	int exponente=3;

	System.out.println(calcular(base, exponente));
	
	}
	public static int calcular (int base, int exponente){
	if(exponente==1)
		return 1;
	
	else if(exponente == 0)
		return 1;
	
	else if(base == 0)
		return 0;
	
	else if(base == 1)
		return 1;
	
	else if(exponente<0)
		return calcular(base, exponente + 1) /base;
	
	else
		return base * calcular(base, exponente - 1);

	}
} 