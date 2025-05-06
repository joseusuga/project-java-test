import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        int opcion;

        try {
            
            System.out.println("=== CONVERTIDOR DE TEMPERATURAS ===");
            System.out.println("Selecciona el tipo de conversión:");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Celsius a Kelvin");
            System.out.println("4. Kelvin a Celsius");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            System.out.print("Ingresa la temperatura: ");
            temperatura = scanner.nextDouble();

            double resultado;

          
            switch (opcion) {
                case 1:
                    resultado = temperatura * 9 / 5 + 32;
                    System.out.printf("Resultado: %.2f °F%n", resultado);
                    break;
                case 2:
                    resultado = (temperatura - 32) * 5 / 9;
                    System.out.printf("Resultado: %.2f °C%n", resultado);
                    break;
                case 3:
                    resultado = temperatura + 273.15;
                    System.out.printf("Resultado: %.2f K%n", resultado);
                    break;
                case 4:
                    resultado = temperatura - 273.15;
                    System.out.printf("Resultado: %.2f °C%n", resultado);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error: Ingresa valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
}
