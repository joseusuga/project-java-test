import java.util.Scanner;

public class OperacionesEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
          
            System.out.print("Ingresa el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int num2 = scanner.nextInt();

            
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            
            String division = (num2 != 0) ? String.valueOf(num1 / num2) : "No se puede dividir entre 0";


            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar solo números enteros.");
        } finally {
            scanner.close();
        }
    }
}
