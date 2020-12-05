package com.unlu.Poo.Prueba;

import com.unlu.Poo.Modelo.Jugador;
import com.unlu.Poo.Modelo.Mazo;
import com.unlu.Poo.Modelo.Pozo;

public class appC {
     public static void main(String[] args) {
		Jugador j1 = new Jugador("Masara");
		Jugador j2 = new Jugador("Tomas");
		
		Mazo mazo = new Mazo(54);
		mazo.inicializar();
		Pozo pozo = new Pozo(mazo.getCarta());
		
		mazo.repatir(j1, j2, 3);
		System.out.println("Jugador1-Reparto");
		j1.cartasJugador();
		System.out.println("Jugador2-Reparto");
		j2.cartasJugador();
		
		System.out.println("Jugador agarra carta del mazo");
		j1.tomarCartaMazo(mazo);
		j1.cartasJugador();
		System.out.println("------------");
        mazo.Cartas();
		System.out.println("Jugador 1 deja carta en el pozo");
	    j1.dejarEnPozo(3, pozo);
	    System.out.println("------------");
	    pozo.getCantidadCartas();
	}
}
