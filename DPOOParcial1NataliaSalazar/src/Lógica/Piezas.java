package Lógica;

import java.util.HashMap;

public abstract class Piezas {
	protected HashMap<Integer, Integer> Coordenadas;
	
	public Piezas() {
		
		HashMap<Integer, Integer > Coordenadas1 = new HashMap<Integer, Integer>();
	}
		
	public void crearCoordenadas(int valor1, int valor2) {
		
		int filas= valor1;
		int columnas= valor2;
		
		Coordenadas.put(filas, columnas);
		
	}
	

}

