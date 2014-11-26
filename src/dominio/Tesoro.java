package dominio;

public class Tesoro {

	Posicion posicion; // Posición donde se encuentra alocado el Tesoro
	String equipoPerteneciente; // Equipo al que pertenece el Tesoro

	// GETTERS & SETTERS
	public Tesoro(Posicion posicion, String equipoPerteneciente) {
		setPosicion(posicion);
		setEquipoPerteneciente(equipoPerteneciente);
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public String getEquipoPerteneciente() {
		return equipoPerteneciente;
	}
	
	public void setEquipoPerteneciente(String equipoPerteneciente) {
		this.equipoPerteneciente = equipoPerteneciente;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
