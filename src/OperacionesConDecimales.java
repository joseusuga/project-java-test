import java.util.Scanner;

public class OperacionesConDecimales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Ingresa el primer número decimal: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número decimal: ");
            double num2 = scanner.nextDouble();

            
            double suma = num1 + num2;
            double resta = num1 - num2;
            double multiplicacion = num1 * num2;
            String division = (num2 != 0) ? String.valueOf(num1 / num2) : "No se puede dividir entre 0";

           
            System.out.println("\nResultados de operaciones con decimales:");
            System.out.printf("Suma: %.2f%n", suma);
            System.out.printf("Resta: %.2f%n", resta);
            System.out.printf("Multiplicación: %.2f%n", multiplicacion);
            System.out.println("División: " + division);

        } catch (Exception e) {
            System.out.println("Error: Ingresa valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
}

