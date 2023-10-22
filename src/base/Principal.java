package base;

import java.util.Scanner;

/**
 * Desarrollar una aplicacion que solicite al usuario los siguientes datos:
 * <ul>
 * <li>Nombre</li> 
 * <li>Apellidos</li> 
 * <li>Telefono</li> 
 * <li>Email</li> 
 * <li>Direccion</li> 
 * <li>Edad</li> 
 * <li>Estatura</li> 
 * <li>Peso</li>
 * </ul>
 * @author Marcos Lema Rodriguez
 * @version v1.0
 * <br>
 * DNI: 47374401J
 * <br>
 * Modulo: programacion DAW2324
 * <br>
 * Email: marcos.lema@formacionchios.es
 * <br>
 * Actividad: Actividad01
 */
public class Principal {
	
	// Variable global
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Metodo para arrancar la aplicacion
	 */

	public static void main(String[] args) {
		
		String nombreUsuario;
		String apellidosUsuario;
		int telefonoUsuario;
		String emailUsuario;
		String direccionUsuario;
		int edadUsuario;
		int estaturaUsuario;
		float pesoUsuario;
		
		System.out.print("Ingrese su nombre: ");
		nombreUsuario = sc.nextLine();
		
		System.out.print("Ingrese sus apellidos: ");
		apellidosUsuario = sc.nextLine();
		
		System.out.print("Ingrese su teléfono: ");
		telefonoUsuario = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Ingrese su email: ");
		emailUsuario = sc.nextLine();
		
		System.out.print("Ingrese su dirección: ");
		direccionUsuario = sc.nextLine();
		
		System.out.print("Ingrese su edad: ");
		edadUsuario = sc.nextInt();
		
		System.out.print("Ingrese su estatura (en cm): ");
		estaturaUsuario = sc.nextInt();

		System.out.print("Ingrese su peso (en kg): ");
		pesoUsuario = sc.nextFloat();
		

		// Mostrar los datos ingresados por el usuario
		System.out.println("\nDatos introducidos: ");
		System.out.println(apellidosUsuario + ", "  + nombreUsuario);
		System.out.println("Teléfono de contacto: " + telefonoUsuario);
		System.out.println("Email: " + emailUsuario);
		System.out.println("Dirección: " + direccionUsuario);
		System.out.println("Edad: " + edadUsuario + " años");
		System.out.println("Estatura: " + estaturaUsuario + " cm");
		System.out.println("Peso: " + pesoUsuario + " kg");
		
		System.exit(0);
	}

}