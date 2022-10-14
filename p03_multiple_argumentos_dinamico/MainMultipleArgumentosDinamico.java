import java.util.Scanner;

class MainMultipleArgumentosDinamico {

    public static Integer suma(int[] numero) {
        int suma = 0;

        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }
        return suma;
    }


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int cantidadNumeros;
        int resultado = 0;

        System.out.println("Cuantos numeros desea sumar?");
        cantidadNumeros = Integer.parseInt(cin.nextLine());
        
        int arrNumeros[] = new int[cantidadNumeros];

        for (int i = 0; i < arrNumeros.length; i++) {
            System.out.println("Digite el numero " + (i + 1));
            arrNumeros[i] = Integer.parseInt(cin.nextLine());
        }

        for (int i = 0; i < arrNumeros.length; i++) {
            resultado = suma(arrNumeros);
        }

        System.out.println("\nEl resultado de la suma es: " + resultado);
    }
}