package com.unlu.Poo.Modelo;

import java.util.ArrayList;


public class Jugador {

	private String nickName;
	private int puntos;
	private boolean turno;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();

	public Jugador(String nickName) {
		this.puntos = 0;
		setNombre(nickName);
	}

	public void setCarta(Carta carta) {
		cartas.add(carta);
	}

	public void agregarCarta(Carta carta) {
		cartas.add(carta);
	}

	public void cartasJugador() {
		for (Carta carta : cartas) {
			System.out.println(carta.toString());
		}
	}

	public void tomarCartaMazo(Mazo mazo) {
		cartas.add(mazo.getCarta());
	}

	public void dejarEnPozo(int i, Pozo pozo) {
		pozo.agregarCarta(cartas.get(i));
		cartas.remove(i);
	}

	public void tomarDelPozo(Pozo pozo) {
		cartas.add(pozo.getCarta());
	}

	public void setNombre(String NickName) {
		this.nickName = NickName;

	}

	@Override
	public String toString() {
		return "NickName=" + nickName + ", puntos=" + puntos;
	}

}
