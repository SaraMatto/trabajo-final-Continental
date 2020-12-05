package com.unlu.Poo.Modelo;

import java.util.ArrayList;

public class Mazo {
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private int cantidad;
    private int inicioMazo;
    
	public Mazo() {
		this.inicioMazo= 0;
	}

	public Mazo(int i) {
		this.cantidad = i;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int i) {
		this.cantidad = i;
	}

	public void inicializar() {
		for (int i = 0; i < this.cantidad; i++) {
			Carta carta = new Carta();
			carta = verificaRepeticion(carta);
			cartas.add(carta);
			System.out.println(carta.getPalo() + "," + carta.getNumero());
		}
	}

	private Carta verificaRepeticion(Carta carta) {
		boolean flag = true;
		while (flag) {
			int i = 0;
			boolean otro = true;
			while (i < cartas.size() && otro) {
				if (cartas.get(i).getPalo() == carta.getPalo() && cartas.get(i).getNum() == carta.getNum()) {
					carta.generarCartaRandom();
					otro = false;
				}
				i++;
			}
			if (otro) {
				flag = false;
			}
		}
		return carta;
	}
	
	

	public void repatir(Jugador jugador1, Jugador jugador2,int partida) {
		for (int i = 0; i < partida; i++) {
			jugador1.agregarCarta(getCarta());
			cartas.remove(i);
			jugador2.agregarCarta(getCarta());
			cartas.remove(i);
		}
		
	}

	public Carta getCarta() {
		Carta c = new Carta();
		c = cartas.get(inicioMazo);
		cartas.remove(inicioMazo);
		return c;
	}

	@Override
	public String toString() {
		return "Mazo [" + cartas + "]";
	}

	public void Cartas() {
		for (Carta carta : cartas) {
			System.out.println(carta.toString());
		}
		
	}



}
