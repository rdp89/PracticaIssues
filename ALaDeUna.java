package listadobasico2;
/**
Define  la  clase  ALaDeUna  que  muestre  el  siguiente  resultado.    Utiliza  los  bucles 
indicados.
@author RDP89
@version 1.0
*/
public class ALaDeUna {

	public static void main(String[] args) {
		int i = 1;//Declaración, inicialización de la variable
		//Bucle while
			while(i<=3) {
				System.out.println("A la de "+i+"...(Bucle while)");
				i++;
			}
			System.out.println("\n");
			//Bucle do while
			i=1;//Reiniciar variable al valor 1
			do {
				System.out.println("A la de "+i+"...(Bucle do-while)");
				i++;
			} while (i<=3);
			System.out.println("\n");
			//Bucle for
			for (i = 1; i <= 3; i++) {
				System.out.println("A la de "+i+"...(Bucle for)");
			}
		}

	}
