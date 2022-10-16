import java.util.Scanner;
import java.util.Random;

public class MainAdivinaNumero
{
    public static void main (String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rnd = new Random();
        int numero = rnd.nextInt(10) + 1;
        int intentos = 0;
        int numeroUsuario;
        boolean acertado = false;
        
        do {
            System.out.print("\nIntroduce un numero: ");
            numeroUsuario = cin.nextInt();
            intentos++;
            
            if (numeroUsuario == numero) {
                acertado = true;
            } else if (numeroUsuario < numero){
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }
        } while (!acertado);

        System.out.println("Has acertado en " + intentos + " intentos");
    }
}