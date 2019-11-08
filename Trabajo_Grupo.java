
package trabajo_grupo;

import java.util.Scanner;

/**
 * @author Sebastian Lopez Mora
 *         Santiago Buritica
 *         Laura Lopez Alvarez
 */

public class Trabajo_Grupo {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroUno, numeroDos, numeroTres, numeroCuatro, numeroCinco;
		int a, b, c, d, e;
                
                System.out.println("Ingrese 5 numeros: ");
                System.out.println("Ingrese el valor de numero uno: ");
		numeroUno = scan.nextInt();
		System.out.println("Ingrese el valor de numero dos: ");
		numeroDos = scan.nextInt();
		System.out.println("Ingrese el valor de numero tres: ");
		numeroTres = scan.nextInt();
		System.out.println("Ingrese el valor de numero cuatro: ");
		numeroCuatro = scan.nextInt();
		System.out.println("Ingrese el valor de numero cinco: ");
		numeroCinco = scan.nextInt();
                
                a = numeroUno;
		b = numeroDos;
		c = numeroTres;
		d = numeroCuatro;
		e = numeroCinco;
                
                //*numero uno*
                
                if (numeroUno > numeroDos && numeroUno > numeroTres && numeroUno > numeroCuatro && numeroUno > numeroCinco) {
			a = numeroUno;
		}
                
                if (numeroUno < numeroDos && numeroUno > numeroTres && numeroUno > numeroCuatro && numeroUno > numeroCinco) {
			b = numeroUno;
		}
                
                if (numeroUno < numeroDos && numeroUno < numeroTres && numeroUno > numeroCuatro && numeroUno > numeroCinco) {
			c = numeroUno;
                }
                if (numeroUno < numeroDos && numeroUno < numeroTres && numeroUno < numeroCuatro && numeroUno > numeroCinco) {
			d = numeroUno;
		}

                if (numeroUno < numeroDos && numeroUno < numeroTres && numeroUno < numeroCuatro && numeroUno < numeroCinco) {
			e = numeroUno;
		}
	         
                //*numero dos*
                
                if (numeroDos > numeroUno && numeroDos > numeroTres && numeroDos > numeroCuatro && numeroDos > numeroCinco) {
			a = numeroDos;
		}
                if (numeroDos < numeroUno && numeroDos > numeroTres && numeroDos > numeroCuatro && numeroDos > numeroCinco) {
			b = numeroDos;
		}
                if (numeroDos < numeroUno && numeroDos < numeroTres && numeroDos > numeroCuatro && numeroDos > numeroCinco) {
			c = numeroDos;
		}
                if (numeroDos < numeroUno && numeroDos < numeroTres && numeroDos < numeroCuatro && numeroDos > numeroCinco) {
			d = numeroDos;
		}
                if (numeroDos < numeroUno && numeroDos < numeroTres && numeroDos < numeroCuatro && numeroDos < numeroCinco) {
			e = numeroDos;
		}
	    
                //*numero tres*
                
                if (numeroTres > numeroUno && numeroTres > numeroDos && numeroTres > numeroCuatro && numeroTres > numeroCinco) {
			a = numeroTres;
		}
                if (numeroTres < numeroUno && numeroTres > numeroDos && numeroTres > numeroCuatro && numeroTres > numeroCinco) {
			b = numeroTres;
		}
                if (numeroTres < numeroUno && numeroTres < numeroDos && numeroTres > numeroCuatro && numeroTres > numeroCinco) {
			c = numeroTres;
		}
                if (numeroTres < numeroUno && numeroTres < numeroDos && numeroTres < numeroCuatro && numeroTres > numeroCinco) {
			d = numeroTres;
		}
                if (numeroTres < numeroUno && numeroTres < numeroDos && numeroTres < numeroCuatro && numeroTres < numeroCinco) {
			e = numeroTres;
		}
	        //*numero cuatro*
                
                if (numeroCuatro > numeroUno && numeroCuatro > numeroDos && numeroCuatro > numeroTres && numeroCuatro > numeroCinco) {
			a = numeroCuatro;
                }        
                if (numeroCuatro < numeroUno && numeroCuatro > numeroDos && numeroCuatro > numeroTres && numeroCuatro > numeroCinco) {
			b = numeroCuatro;
                }        
                if (numeroCuatro < numeroUno && numeroCuatro < numeroDos && numeroCuatro > numeroTres && numeroCuatro > numeroCinco) {
			c = numeroCuatro;
                }        
                if (numeroCuatro < numeroUno && numeroCuatro < numeroDos && numeroCuatro < numeroTres && numeroCuatro > numeroCinco) {
			d = numeroCuatro;
                }        
                if (numeroCuatro < numeroUno && numeroCuatro < numeroDos && numeroCuatro < numeroTres && numeroCuatro < numeroCinco) {
			e = numeroCuatro;              
		}
                
                 //*numero cinco*
                
                if (numeroCinco > numeroUno && numeroCinco > numeroDos && numeroCinco > numeroTres && numeroCinco > numeroCuatro) {
			a = numeroCinco;
                }        
                if (numeroCinco < numeroUno && numeroCinco > numeroDos && numeroCinco > numeroTres && numeroCinco > numeroCuatro) {
			b = numeroCinco;
                }        
                if (numeroCinco < numeroUno && numeroCinco < numeroDos && numeroCinco > numeroTres && numeroCinco > numeroCuatro) {
			c = numeroCinco;        
                }        
                if (numeroCinco < numeroUno && numeroCinco < numeroDos && numeroCinco < numeroTres && numeroCinco > numeroCuatro) {
			d = numeroCinco;
                }        
                if (numeroCinco < numeroUno && numeroCinco < numeroDos && numeroCinco < numeroTres && numeroCinco < numeroCuatro) {
			e = numeroCinco;
                }
                
                System.out.print(" " + a + " " + b + " " + c + " " + d + " " + e); 
                
	    
	    
}
}
    
