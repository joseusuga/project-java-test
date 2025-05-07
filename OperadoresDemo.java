public class OperadoresDemo {
    public static void main(String[] args) {
       
        int numero = 10;
        System.out.println("Valor inicial: " + numero);

        numero += 5; 
        System.out.println("Después de += 5: " + numero);

        numero -= 2; 
        System.out.println("Después de -= 2: " + numero);

        numero *= 3; 
        System.out.println("Después de *= 3: " + numero);

        numero /= 4;
        System.out.println("Después de /= 4: " + numero);

        numero %= 3; 
        System.out.println("Después de %= 3: " + numero);

        
        numero = 5;
        System.out.println("\nValor reiniciado a: " + numero);

        numero++; 
        System.out.println("Después de numero++: " + numero);

        ++numero; 
        System.out.println("Después de ++numero: " + numero);

        numero--; 
        System.out.println("Después de numero--: " + numero);

        --numero; 
        System.out.println("Después de --numero: " + numero);
    }
}

