package com.unlu.Poo.Modelo;

import java.util.Random;

import com.unlu.Poo.Modelo.Palo;

public class Carta {
	private Palo palo;
	private int numero;

	public Carta(Palo palo, int numero) {
		this.palo = palo;
		this.numero = numero;
	}

	public Carta() {
		this.generarCartaRandom();
	}

	public String getNumero() {
		String numero = "";
		if (this.numero == 0 || this.numero == -1) {
			numero = "Comodin";
		} else if (this.numero == 11) {
			numero = "J";
		} else if (this.numero == 12) {
			numero = "Q";
		} else if (this.numero == 13) {
			numero = "K";
		} else
			numero = String.valueOf(this.numero);

		return numero;
	}

	public int getNum() {
		return this.numero;
	}

	public Palo getPalo() {
		return this.palo;
	}

	public void generarCartaRandom() {
		Random r = new Random();
		int r1 = r.nextInt(6) + 1;
		int r2 = r.nextInt(13) + 1;
		switch (r1) {
		case 1:
			this.palo = Palo.JOKER;
			this.numero = -1;
			break;
		case 2:
			this.palo = Palo.JOKER;
			this.numero = 0;
			break;	
		case 3:
			this.palo = Palo.ESPADAS;
			this.numero = r2;
			break;
		case 4:
			this.palo = Palo.CORAZON;
			this.numero = r2;
			break;
		case 5:
			this.palo = Palo.ROMBO;
			this.numero = r2;
			break;
		case 6:
			this.palo = Palo.TREVOL;
			this.numero = r2;
			break;
		default:
			break;
		}

	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + this.getNumero() + "]";
	}

}
