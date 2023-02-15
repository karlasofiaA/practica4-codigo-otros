package com.generation;
//Creamos un paquete llamado com.generation para que el archivo esté dentro
import java.util.Scanner;

//La clase tenía un nombre diferente al nombre del documento
public class Ejercicio4{
	
	/*
	 * El prográma básicamente pide dos entrada de datos, una para cada jugador. 
	 * Se leen las entradas que tiene que coincidir con las opciones "piedra", "papel" o "tijera"
	 * y básicamente las condicionales vamos a decartar en primer lugar si hay un empate, 
	 * mandando un mensaje en consola si ambas entradas son iguales.
	 * Sino va a entrar en un switch que no dirá qué jugador gana la partida, el 1 o el 2 y
	 *  nos manda un mensaje en consola diciendo el ganador del juego. 
	*/

	//Falta instanciar la función main
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //Importar Scanner y poner entre los paréntesis "System.in"
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Cambiar jugador 1 por 2 para decir que es su turno
    //Scanner s2 = new Scanner(System.in); //No hace falta instanciar el Scanner otra vez
    String j2 = s.nextLine();
    
    if (j1.contentEquals(j2)) { //Se cambia "==" para compara el contenido, no la referencia
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) { //Comparamos con "equals"
            g = 1;
          }
          break; //Falta el break
        case "papel":
          if (j2.equals("piedra")) { //Comparamos con "equals"
            g = 1;
          } //No tenía cerrada la llave
          break; //Falta el break
        case "tijeras": //Agregar una "s"
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
        	
      }
      System.out.println("Gana el jugador " + g);
    }
    }
    }
//Tenía un parétesis de más


