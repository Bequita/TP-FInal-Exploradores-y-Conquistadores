package dominio;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Explorador extends Thread {

	Tablero tablero;
	Posicion posicion;
	String equipo;
	Integer id;

	// GETTERS & SETTERS

	public Explorador(Tablero t, Posicion p, String equipo) {
		this.tablero = t;
		this.posicion = p;
		this.equipo = equipo;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
		
	// Da una posicion aleatoria posible a la que el explorador puede moverse
//	public Posicion obtenerPosicion(){
//		
//		// Creo que funciona, acá esta el link de donde lo saqué: https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ThreadLocalRandom.html
//		
//		int xNueva = ThreadLocalRandom.current().nextInt(this.getTablero().getTamanio());
//		int yNueva = ThreadLocalRandom.current().nextInt(this.getTablero().getTamanio());
//
//		Posicion posicionNueva = new Posicion(xNueva,yNueva);
//		
//		return posicionNueva;
//	}

	// Devuelve True si la posicion nueva esta en el borde del tablero
	public boolean esBorde(Tablero t, Posicion s){
		return (t.getTamanio() == s.getX() || t.getTamanio() == s.getY());
	}
	
	public void moverse() {
		Random rnd = new Random();
		
		if(rnd.nextFloat() > 0.2) {
			
//			Posicion pos = this.obtenerPosicion();
			
			if(puedoMovermeFrontalmente(pos)) {
				this.setPosicion(pos);
			}
			else {
				(this.getPosicion()).setX(pos.getX());
			}
		}
		else {
			// No se mueve en este turno.
		}
	}

	private boolean puedoMovermeFrontalmente(Posicion pos) {
		// CREAR METODO QUE VERIFIQUE QUE EN CASILLAS VECINAS TENGO UN JUGADOR DE MI EQUIPO
		return false;
	}

	@Override
	public void run() {
		Tablero tab = new Tablero(11, null, null, null, null);
		Posicion pos = new Posicion(5, 5);
		
		Explorador ex = new Explorador(tab, pos, "PUTON");
		
		ex.obtenerPosicion();
	}
	
	public static void main(String[] args) {
//		Tablero tab = new Tablero(11, null, null, null, null);
//		Posicion pos = new Posicion(5, 5);
//		
//		Explorador ex = new Explorador(tab, pos, "asad");
//		ex.start();
	}	
}