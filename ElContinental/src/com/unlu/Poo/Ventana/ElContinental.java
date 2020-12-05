package com.unlu.Poo.Ventana;

import java.util.ArrayList;
import java.util.Scanner;

import com.unlu.Poo.Modelo.Estado;
import com.unlu.Poo.Modelo.Jugador;
import com.unlu.Poo.Modelo.Mazo;
import com.unlu.Poo.Modelo.Pozo;



public class ElContinental implements IvistaContinental {
	private ArrayList<Jugador> Jugadores;
	private int maxJugadores;
	private int partida;
	private Mazo mazo;
	private Pozo pozo;
	private Estado estado;

	public ElContinental() {
		partida = 1;
		estado = Estado.COMIENZO;
		Jugadores = new ArrayList<Jugador>();
		maxJugadores = 2;
	}

	/*public static void main(String[] args) {
		ElContinental juegoContinental = new ElContinental();
		juegoContinental.inicarJuego();
	}*/

	public void inicarJuego() {
		int opcion = 1;
		while (opcion != 0) {
			opcion = MenuJuego();
			switch (opcion) {
			case 1:
				Jugadores.add(new Jugador(menuNickName()));
				break;
			case 2:
				ListaJugadores();
				break;
			case 3:
				if (Jugadores.size() < maxJugadores) {
					jugar();
				}
				break;

			default:
				break;
			}
		}
	}
	
	
	private void jugar() {
		mazo = new Mazo();
		pozo = new Pozo(mazo.getCarta());
		jugarComiezo();
	}

	private void jugarComiezo() {
		while (estado != Estado.FINALIZAR_JUEGO) {
			switch (this.partida) {
			case 1:
				partidaUno();
				break;
			/*case 2:
				partidaDos();
				break;
			case 3:
				partidaTres();
				break;
			case 4:
				partidaCuatro();
				break;
			case 5:
				partidaCinco();
				break;
			case 6:
				partidaSeis();
				break;
			case 7:
				partidaSiete();
				this.estado = Estado.FINALIZAR_JUEGO;
				break;*/

			default:
				break;
			}
		}

	}

	private String menuNickName() {
		String nombre = "";
		while (nombre == "") {
			System.out.println("_______________________________________");
			System.out.println("|---------------MENU NICK-------------|");
			System.out.println("|-------------------------------------|");
			System.out.println("|------------INGRESE SU NOMBRE--------|");
			System.out.println("|_____________________________________|");
			System.out.println("|@@@@@@@@@@@@@@ ELECCION @@@@@@@@@@@@@|");

			Scanner teclado = new Scanner(System.in);
			nombre = teclado.nextLine();

		}

		return nombre;

	}

	private int MenuJuego() {
		int opcion = -1;
		while (opcion < 1 || opcion > 4) {
			System.out.println("________________________________________________");
			System.out.println("|----------------------MENU---------------------|");
			System.out.println("|-----------------------------------------------|");
			System.out.println("|------------------ELCONTINENTAL----------------|");
			System.out.println("|-----------------------------------------------|");
			System.out.println("|----------------1)CREAR JUGADOR----------------|");
			System.out.println("|-----------------------------------------------|");
			System.out.println("|-------------2)JUGADORES EN LA SALA------------|");
			System.out.println("|-----------------------------------------------|");
			System.out.println("|--------------- 3)COMENZAR 1 Vs 1--------------|");
			System.out.println("|-----------------------------------------------|");
			System.out.println("|------------------4)PUNTAJES-------------------|");
			System.out.println("|-----------------------------------------------|");
			System.out.println("|------------------5)FIN JUEGO------------------|");
			System.out.println("|-----------------------------------------------|");
			System.out.println("|_______________________________________________|");
			System.out.println("|@@@@@@@@@@@@@@@@@@@ ELECCION @@@@@@@@@@@@@@@@@@|");

			Scanner teclado = new Scanner(System.in);
			opcion = teclado.nextInt();

		}

		return opcion;
	}

	private void ListaJugadores() {
		String opcion = "";
		int i = 1;
		System.out.println("|_______________________________________________|");
		System.out.println("|-------------------JUGADORES-------------------|");
		for (Jugador jugador : Jugadores) {
			System.out.println("Jugador" + i + "=>" + jugador.toString());
		}
		System.out.println("|-------------------SALIENDO...-----------------|");
		try {
			Thread.sleep(5 * 1000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void inicioJuego() {
		// TODO Auto-generated method stub

	}

	@Override
	public void partidaUno() {
		

	}

	@Override
	public void partidaDos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void partidaTres() {
		// TODO Auto-generated method stub

	}

	@Override
	public void partidaCuatro() {
		// TODO Auto-generated method stub

	}

	@Override
	public void partidaCinco() {
		// TODO Auto-generated method stub

	}

	@Override
	public void partidaSeis() {
		// TODO Auto-generated method stub

	}

	@Override
	public void partidaSiete() {
		// TODO Auto-generated method stub

	}
}
