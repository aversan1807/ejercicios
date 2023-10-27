import java.util.Scanner;

public class multiplo13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

int numero;
        do {

            System.out.println("Introduce un numero: ");

             numero = entrada.nextInt();

            for (int i = 13; i < numero; i+=13) {
                System.out.println(i);

            }
        } while (numero!=-1);
    }
}