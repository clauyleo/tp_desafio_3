    package desafio_3;

import java.util.InputMismatchException;

import java.util.Scanner;

public class desafio_3 { 
	

	 static String[] titulo = { "Rafaela", "Harry Potter", "El chico sucio"};
	    static String[] autor = {"Juan gonzales", "Alegra benitez", "Mariaelena rodriguez"};
	    static int[] numPaginas ={ 200, 350, 180 }; 
	    static int numLibros =  titulo.length;;
	    static int opciones ;
	    
	public static void opcion() {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("1. mostrar la lista de libros ");
		System.out.println("2. buscar un libro por titulo ");
		System.out.println("3. Salir");

		System.out.println("Elija una de estas opciones: ");
		
		opciones = datos.nextInt();
	}
	
	public static void libros() {
		try {
	        
	            for (int i = 0; i < numLibros; i++) {
	                System.out.println("Título: " + titulo[i]);
	                System.out.println("Autor: " + autor[i]);
	                System.out.println("Número de páginas: " + numPaginas[i]);
	            
	            }
	        


	} 
	 catch (InputMismatchException e) {
		System.out.println("Error: Debes ingresar un dato valido.");
	}
	}
	
	
	public static void autores() {
		try {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("ingrese el titulo del libro: ");
		
			 
			 String tituloBuscado = entrada.nextLine();

		        boolean encontrado = false;

		        for (int i = 0; i < numLibros; i++) {
		            if (titulo[i].equalsIgnoreCase(tituloBuscado)) {
		                System.out.println("Título: " + titulo[i]);
		                System.out.println("Autor: " + autor[i]);
		                System.out.println("Número de páginas: " + numPaginas[i]);
		        
		                encontrado = true;
		            }
		        }

		        if (!encontrado) {
		            System.out.println("Libro no encontrado.");
		        }
		    
		} catch (ArithmeticException e) {
			System.out.println("Error: División por cero no permitida.");
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato valido.");
		}	
		}
		
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner datos = new Scanner(System.in);
        while (true) {
            opcion();

            switch (opciones) {
                case 1:
                    libros();
                    break;
                case 2:
                    autores();
                    break;
               
                default:
                    System.out.println("Seleccionaste la opción incorrecta");
                    break;
            }

            System.out.println("¿Desea realizar otra opcion? (si/no): ");
            String respuesta = datos.next(); 

            if (!respuesta.equalsIgnoreCase("si")) {
                break; 
            }
        }
    }
}
