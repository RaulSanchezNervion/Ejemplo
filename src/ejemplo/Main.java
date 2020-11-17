package ejemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			//DeclaracionVariables
			
			Cadena a=new Cadena("Hola");
			Cadena b=new Cadena("Lolo");
			
			cambio(a,b);
			
			System.out.println(b.getValue());
		
			char car,ant=' ';
			int contMayus=0,contPuntuacion=0,consecutiva=0, totalCaracteres=0;
			float porcentMayus, porcentPuntuacion, porcentConsecutiva;
			Scanner tec=new Scanner (System.in);


			//ObtenerCaracter
			System.out.print("Introducir Caracter: ");
			car=tec.next().charAt(0);
				
			while(car!='*')
			{
				//ContarMayus
				if (Character.isUpperCase(car))
				{
					contMayus++;
				}//fin if

				//ContarPuntuacion
				if(car=='.' ||car==','||car==';'||car==':'||car=='-'||car=='?'||car=='?'||car=='\\'||car=='�'||car=='�') //no compila estos caracteres
				{
					contPuntuacion++;
				}//fin if
				
				//ContarConsecutivo
				if (ant==car && car!='*')
				{
					consecutiva++;
				}//fin if
				
				//GuardarCaracterAnterior
				ant=car;
				
				//AcumularCaracteres
				totalCaracteres++;
				
				//ObtenerCaracter
				System.out.print("Introducir Caracter: ");
				car=tec.next().charAt(0);

			}//fin while



			//PresentarResultados
	                if(totalCaracteres!=0)
	                {
						//CalcularPorcentaje
						porcentMayus=contMayus*100/(totalCaracteres);
						porcentPuntuacion=contPuntuacion*100/(totalCaracteres);
						porcentConsecutiva=consecutiva*100/(totalCaracteres);
						
						//PintoEnPantalla
	                      System.out.println("N� de letras mayusculas: "+contMayus+" Porcentaje: "+porcentMayus+"%");
	                      System.out.println("N� de signos: "+contPuntuacion+" Porcentaje: "+porcentPuntuacion+"%"); 
	                      System.out.println("N� de veces consecutivo: "+consecutiva+" Porcentaje: "+porcentConsecutiva+"%");
					}//fin if
					else
					{
	                      System.out.println("No se ha escrito ningun caracter");
					}//fin else
		tec.close();
		}//fin main

	private static void cambio(Cadena a2, Cadena b) {
		b.setValue(a2.getValue());
		
	}

	}//fin class

/*

			Construye un programa que lea un n�mero entero positivo y dibuje un tri�ngulo empezando por un *,

 			la l�nea siguiente dos, y as� sucesivamente hasta llegar al n�mero le�do. Por ejemplo, con 4 ser�a


 *

 **

 ***

 ****


 */



