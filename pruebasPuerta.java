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
	
	//Para estas pruebas se crear� la combinaci�n a usar durante el resto del proyecto,
	//mostr�ndola por anchura para verificar la correcta implementaci�n de cada m�todo.
	public static void main(String[] args){
		
		//Generaci�n llaves
		Llave[] vect = new Llave[15];
		for (int i = 1; i<=15;i++)
		{
			vect[i-1] = new Llave(2*i - 1);
		}
		Puerta p = new Puerta(vect, 4);
		p.mostrarVectorCfg();
		System.out.println(p.getCombinacion().arbolAString());
		p.getCombinacion().anchura();
		p.probarLlave(new Llave(5));
		p.getCombinacion().anchura();
	}
}
