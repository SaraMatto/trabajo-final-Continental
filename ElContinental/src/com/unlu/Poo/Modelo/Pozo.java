package com.unlu.Poo.Modelo;

import java.util.ArrayList;

public class Pozo extends Mazo{
    private ArrayList<Carta> cartasPozo = new ArrayList<Carta>();
	private int superior;
	
	public Pozo(Carta carta) {
		cartasPozo.add(carta);
		superior = 0;
	}

	public void agregarCarta(Carta carta) {
		cartasPozo.add(carta);
		superior += 1;
	}
	
	public void getCantidadCartas() {
		System.out.println(cartasPozo.get(superior));
	}

	

    

	
	
	
	
	
}
