package Lógica;

public class Peón extends Piezas {
	
	public void Peon() {
		super.Coordenadas(valor1, valor2);
	} 
	public void movimientos() {
		
		if (Coordenadas.containsKey()== 7) {
			desplazamiento(2,0);
		}else {
			desplazamiento(1,0);
		}
	}
	

}
