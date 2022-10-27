public class MainTablaMultiplicar {

    public static void main(String[] args) {
        int desde = 1;
        int hasta = 15;
        int producto;

        for (int i = desde; i<= hasta; i++) 
        {
            System.out.println(String.format("\n=== TABLA DEL %d ===", i));
            for (int j = 1; j <= 12; j++) 
            {
                producto = i * j;
                System.out.println(i + "x" + j + "=" + producto);
            }
        }
    }
}