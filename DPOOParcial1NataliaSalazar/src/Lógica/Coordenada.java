package Lógica;

public class Coordenada {
	
	public int filas;
	public int colummnas;

	public void setFilas(int filas) {
		this.filas = filas;
	}
	public void setcolumnas(int filas) {
		this.filas = filas;
	}
	
	public int  desplazamiento(int filas, int columnas) {
		Coordenadas.getKey()+= filas;
		Coordenadas.getValue()+=columnas;
		
		return Coordenadas;
	}
	
	}


