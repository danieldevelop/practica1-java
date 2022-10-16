import java.util.Scanner;

public class MainFactorial 
{
    public static double factorialFor(int numero) {
        double resultadoFactorial = 1;

        for (int i = 2; i <= numero; i++) {
            resultadoFactorial = resultadoFactorial * i;
        }

        return resultadoFactorial;
    }

    public static double factorialWhile(int numero) {
        double resultadoFactorial = 1; // TODO: Al implementar la variable de forma global, la funcion deja de funcionar
        
        while (numero > 0) {
            resultadoFactorial = resultadoFactorial * numero;
            numero--; // == numero = numero - 1;
        }

        return resultadoFactorial;
    }

    public static double factorialDoWhile(int numero) {
        double resultadoFactorial = 1; // TODO: Al implementar la variable de forma global, la funcion deja de funcionar

        if (numero == 0) {
            return 1;
        } else {
            do {
                resultadoFactorial = resultadoFactorial * numero;
                numero--;

            } while (numero > 0);
        }

        return resultadoFactorial;
    }

    public static double factorialRecursividad(int numero) {
        double resultadoFactorial = 1;
        
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorialRecursividad(numero - 1);
        }
    }




    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        int numero;

        System.out.print("\nIngrese un numero: ");
        numero = cin.nextInt();

        /**
         * Aqui mostramos de diferentes formas de calcular el factorial de un número 
         * entregado por el usuario.
         */
        System.out.println(String.format("\nIterador for: El factorial de %d es %.0f", numero, factorialFor(numero)));
        System.out.println(String.format("Ciclo while: El factorial de %d es %.0f", numero, factorialWhile(numero)));
        System.out.println(String.format("Ciclo do-while: El factorial de %d es %.0f", numero, factorialDoWhile(numero)));
        System.out.println(String.format("Recursividad: El factorial de %d es %.0f", numero, factorialRecursividad(numero)));

    }
}