package Pruebas;

import DEV.Puerta;
import Estructuras.Llave;

/**
* Declaracion de la clase pruebasPuerta
* @author
*   <b> Antonio Rebollo Guerra,</b><br>
*   <b>Carlos Salguero Sanchez. </b><br>
*   <b> Asignatura Desarrollo de Programas</b><br>
*   <b> Curso 16/17 </b>
*/
public class pruebasPuerta {
	
	public static void prueba1(){
		
		//Para estas pruebas se creará la combinación a usar durante el resto del proyecto,
		//mostrándola por anchura para verificar la correcta implementación de cada método.
		
		//Generación llaves
		Llave[] vect = new Llave[15];
		
		for (int i = 1; i<=15;i++)
		{
			vect[i-1] = new Llave(2*i - 1);
		}
		
		Puerta p = new Puerta(vect, 4);
		
		System.out.println("---- Inicio Pruebas configuracion de la puerta ----");
		System.out.println(" ");
		
		
		System.out.println("Ambos vectores deben ser iguales");
		p.mostrarVectorCfg();	
		System.out.println(p.getCombinacion().arbolAString());
		System.out.println(" ");
		
		System.out.println("Mostrando el recorrido en anchura");
		p.getCombinacion().anchura();
		System.out.println(" ");
		
		System.out.println("---- Fin Pruebas configuracion de la puerta ----");
		System.out.println(" ");
		
		
		System.out.println("---- Inicio Pruebas insertado/eliminacion ----");
		
		if (!p.getCombinacion().existe(new Llave(5)))
			System.out.println("Error");
		
		p.probarLlave(new Llave(5));
		
		if (p.getCombinacion().existe(new Llave(5)))
			System.out.println("Error");
		
		if (!p.getProbados().existe(new Llave(5)))
			System.out.println("Error");
		
		if (p.getProbados().existe(new Llave(1)))
			System.out.println("Error");
		
		p.cerrarPuerta();
		
		if (!p.getCombinacion().existe(new Llave(5)))
			System.out.println("Error");
		
		if (p.getProbados().existe(new Llave(5)))
			System.out.println("Error");
		
		System.out.println("---- Fin Pruebas insertado/eliminacion ----");
		System.out.println(" ");
		
	}
	
	public static void main(String[] args){
		
		prueba1();
		
	}
}
