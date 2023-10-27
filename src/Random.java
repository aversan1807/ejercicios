import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int max = 10;
        int min = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println( "metodo1: " + (int) Math.random() * (max - min +1) + min);

        }

    }
}
