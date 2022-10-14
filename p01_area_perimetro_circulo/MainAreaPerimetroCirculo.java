import java.util.Scanner;

class MainAreaPerimetroCirculo {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Introduce el radio del circulo: ");
        double radio = cin.nextDouble();
        
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + perimetro);       
    }
}