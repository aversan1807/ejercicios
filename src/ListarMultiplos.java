import java.util.Scanner;

public class ListarMultiplos {
    public static void main(String[] args) {


        for (int i = 10; i < 1000; i++) {

            if (i % 3 == 0 && i % 7 == 0){

                System.out.println(i);
            }

        }
    }
}
