import java.sql.SQLOutput;
import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int altura;
        do {
            System.out.println("Introduce la altura de la pirámide: ");
            altura = entrada.nextInt();

            if (altura == 5) {


            }


            for (int fila = 1; fila <= altura; fila++) {

                for (int blancos = altura - fila; blancos > 0; blancos--) {

                    System.out.println("-");
                }
                for (int as = 1; as < fila * 2; as++) {
                    System.out.println("*");
                }
                System.out.println("");
            }
        }while (altura != -1) ;



    }
}


