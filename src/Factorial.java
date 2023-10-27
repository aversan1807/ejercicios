import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        do{

            System.out.println("Ingresa un numero para calcular su factorial: ");
            numero = entrada.nextInt();

           long factorial= 1;
            if(numero < 0) {
                System.out.println("El factorial no esta definido para numeros negativos");
            }else{
                for (int i = 0; i <= numero ; i++) {

                }
                System.out.println("El factorial de " +numero+ " es " +factorial);
            }
        }while (numero!=-1);

    }
}
