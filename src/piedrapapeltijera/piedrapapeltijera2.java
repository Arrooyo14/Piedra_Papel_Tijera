package piedrapapeltijera;

import java.util.Scanner;

public class piedrapapeltijera2 {
	
	public static void menu() {
		System.out.println("1. Piedra");
		System.out.println("2. Papel");
		System.out.println("3. Tijera");
		System.out.println("4. Salir");
		System.out.println("Elige una opción: ");
		
	}
	
	public static void juegaPC(int numero) {
		switch(numero) {
		case 1: System.out.println("\t Piedra");
				break;
		case 2: 
				System.out.println("\t Papel");
				break;
		case 3: 
				System.out.println("\t Tijera");
				break;
					
		}
	}

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		int secreto=0;
		do {
			menu();
			opcion=teclado.nextInt();
			
			secreto=(int)(1+Math.random()*3);
			
			juegaPC(secreto);
			
			comprobarJugada(opcion,secreto);
			
		}while(opcion!=4);	


	}

	private static void comprobarJugada(int usuario, int pc) {
		if(usuario==pc)
			System.out.println("Empate!!!");
		
		else {
			//Piedra
			if(usuario==1) {
			
				if(pc==2)
					System.out.println("He ganado!");
				if(pc==3) 
					System.out.println("Has ganado! :(");
			}
			//Papel
			if(usuario==2) {
				
				if(pc==1)
					System.out.println("Has ganado!:(");
				if(pc==3) 
					System.out.println("He ganado! :)");
			}
			//Tijera
			if(usuario==3) {
				
				if(pc==1)
					System.out.println("He ganado!:(");
				if(pc==2) 
					System.out.println("Has ganado! :)");
			}
		
	}

	}
}
