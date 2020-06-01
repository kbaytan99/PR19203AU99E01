package application;

import java.util.Random;

public class PR19203AU99E01_Kaan_Baytan {

	/*Escribe un método que crea y inicializa una matriz bidimensional de
	doubles. El tamaño de la matriz está determinada por los argumentos del
	método y los valores de inicialización son un rango determinado por valores
	inicial y final que también son argumentos del método.
	Cree un segundo método que imprimirá por pantalla (de forma legible y
	comprensible para una persona) la matriz generada por el primer método.
	En el main () prueba los métodos creando e imprimiendo varios tamaños
	diferentes.*/
	

	public static double[][] createBidimensional(int a, int b, double nInicial, double nFinal) {
		
		Random random = new Random();
		
	
		double[][] array= new double[a][b];

		for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] =  nInicial + (nFinal - nInicial) * random.nextDouble();
            }
        }
        
		return array;
	}
	
	public static void showArray(double[][] array) {
		
		
		double[][] aux = array;
		for(int k = 0; k < aux.length; k++){
            for(int l = 0; l < aux[0].length; l++){
                String strDouble = String.format("%.2f", array[k][l]);
                System.out.print(strDouble + " ");
            }
            System.out.print("\n");
        }
	}
	
	public static void main (String[] args) {
		
		double[][] array1 = createBidimensional(4, 6, 47.0, 99.0);
		showArray(array1);
		System.out.println("*************");
		double[][] array2 = createBidimensional(2, 2, 47.0, 99.0);
		showArray(array2);
		System.out.println("*************");
		double[][] array3 = createBidimensional(9, 5, 47.0, 99.0);
		showArray(array3); 
	}
	
}
