package org.ueg.math;

public class Matematica {
	
	public double percentual (double total, double valor){
		return valor / total * 100;
	}

	public boolean ePar (int numero){
		
		return (numero %2 == 0);
	}
	
	public int getQuantidadeNumeroPares(int maximo){
		 int cont = 0;
		 for(int i =1; i <= maximo; i++){
			 if(ePar(i))
				 cont++;
		 }
			return cont; 
	}
}
