package unico;

public class Ejercicio {

	public static void main(String[] args) {
		
		Integer[] x = new Integer[6];
		x[0]=1;
		x[1]=2;
		x[2]=3;
		x[3]=4;
		x[4]=5;
		x[5]=6;
		
		rotarDerecha(x);
		mostrarValores(x);
		System.out.println();
		rotarIzq(x);
		mostrarValores(x);
}
	public static void mostrarValores(Integer[] x){
		for(int i=0; i< x.length; i++) {
		Util.escribir("" + x[i]);
		}
}
	public static void rotarDerecha(Integer[]x) {
		int primero = x[0];
		int i;
		for(i= 0; i<x.length-1; i++)
		  x[i] = x[i+1];
		x[i]= primero;
		
	}
	public static void rotarIzq(Integer[]x) {
		int primero = x[5];
		int i;
		for(i= 0; i>x.length-1; i--)
		  x[i] = x[i-1];
		x[i]= primero;
		
	}
}
