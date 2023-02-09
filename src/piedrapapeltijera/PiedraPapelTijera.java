package piedrapapeltijera;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int opcion=0;
		int opcionmaquina=0;
		
		while(opcion<4) {
			System.out.println("Elige una opcion: 1. Piedra, 2.Papel, 3.Tijera, 4.Salir");
			opcion=teclado.nextInt();
			opcionmaquina=(int)(1+Math.random()*3);
			
			switch (opcion) {
			  case 1:
				  System.out.println("Has elegido piedra");;
			    break;
			  case 2:
				  System.out.println("Has elegido papel");
			    break;
			  case 3:
				  System.out.println("Has elegido tijera");  
				break;
			  case 4:
				  System.out.println("Has elegido salir del programa");  
				break;
			  default:
				  System.out.println("El numero introducido no es correcto");
			}
			if(opcion==opcionmaquina) {
				System.out.println("Empate");
			}else {
			
				if(opcion==1) {
					if(opcionmaquina==2) {
						System.out.println("Gana la maquina");
					}
					if(opcionmaquina==3) {
						System.out.println("Gana el usuario");
					}
				}
			
				if(opcion==2) {
					if(opcionmaquina==1) {
						System.out.println("Gana el usuario");
					}
					if(opcionmaquina==3) {
						System.out.println("Gana la maquina");
					}
				}
			
				if(opcion==3) {
					if(opcionmaquina==1) {
						System.out.println("Gana la maquina");
					}
					if(opcionmaquina==2) {
						System.out.println("Gana el usuario");
					}
				}
			}
		}

		
		
	}

}
