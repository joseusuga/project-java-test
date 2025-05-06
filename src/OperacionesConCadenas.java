import java.util.Scanner;

public class OperacionesConCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Ingresa la primera cadena de texto: ");
            String cadena1 = scanner.nextLine();

            System.out.print("Ingresa la segunda cadena de texto: ");
            String cadena2 = scanner.nextLine(); 

            
            String concatenada = cadena1 + " " + cadena2;

           
            boolean sonIguales = cadena1.equalsIgnoreCase(cadena2);

            
            System.out.print("Ingresa la subcadena a buscar en la primera cadena: ");
            String subcadena = scanner.nextLine();
            boolean contieneSubcadena = cadena1.contains(subcadena);

          
            String enMayusculas = cadena1.toUpperCase();
            String enMinusculas = cadena1.toLowerCase();

            
            System.out.println("\nResultados de operaciones con cadenas:");
            System.out.println("Cadenas concatenadas: " + concatenada);
            System.out.println("Las cadenas son iguales (ignorando mayúsculas/minúsculas): " + sonIguales);
            System.out.println("¿La primera cadena contiene la subcadena? " + contieneSubcadena);
            System.out.println("Primera cadena en mayúsculas: " + enMayusculas);
            System.out.println("Primera cadena en minúsculas: " + enMinusculas);

        } catch (Exception e) {
            System.out.println("Error: Ingresa valores de texto válidos.");
        } finally {
            scanner.close(); 
        }
    }
}
