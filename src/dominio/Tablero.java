package dominio;

import java.util.ArrayList;

public class Tablero {

	int tamanio;
	ArrayList<Explorador> exploradores1 = new ArrayList<Explorador>();
	ArrayList<Explorador> exploradores2 = new ArrayList<Explorador>();
	ArrayList<Tesoro> tesorosEquipo1 = new ArrayList<Tesoro>();
	ArrayList<Tesoro> tesorosEquipo2 = new ArrayList<Tesoro>();

	public Tablero(int tamanio, ArrayList<Explorador> e1, ArrayList<Explorador> e2, ArrayList<Tesoro> t1, ArrayList<Tesoro> t2) {
		this.tamanio = tamanio;
		this.exploradores1 = e1;
		this.exploradores2 = e2;
		this.tesorosEquipo1 = t1;
		this.tesorosEquipo2 = t2;
	}
	
	//////////////////////////// GETTERS & SETTERS //////////////////////////////////////
	
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public ArrayList<Explorador> getExploradores1() {
		return exploradores1;
	}

	public void setExploradores1(ArrayList<Explorador> exploradores1) {
		this.exploradores1 = exploradores1;
	}

	public ArrayList<Explorador> getExploradores2() {
		return exploradores2;
	}

	public void setExploradores2(ArrayList<Explorador> exploradores2) {
		this.exploradores2 = exploradores2;
	}

	public ArrayList<Tesoro> getTesorosEquipo1() {
		return tesorosEquipo1;
	}

	public void setTesorosEquipo1(ArrayList<Tesoro> tesorosEquipo1) {
		this.tesorosEquipo1 = tesorosEquipo1;
	}

	public ArrayList<Tesoro> getTesorosEquipo2() {
		return tesorosEquipo2;
	}

	public void setTesorosEquipo2(ArrayList<Tesoro> tesorosEquipo2) {
		this.tesorosEquipo2 = tesorosEquipo2;
	}
	
	////////////////////////////GETTERS & SETTERS //////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
