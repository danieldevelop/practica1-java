import java.util.Scanner;

class MainAreaPerimetroRectangulo {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int alto;
        int ancho;
        int area;
        int perimetro;

        System.out.print("Ingrese el alto del rectangulo: ");
        alto = Integer.parseInt(cin.nextLine());
        System.out.print("Ingrese el ancho del rectangulo: ");
        ancho = Integer.parseInt(cin.nextLine());

        area = alto * ancho;
        perimetro = (alto + ancho) * 2;

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}