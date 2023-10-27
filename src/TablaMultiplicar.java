import java.util.Scanner;

public class TablaMultiplicar {


    public static void main(String[] args) {


        int numero;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("por favor ingrese un numero (-1 para salir)");
            numero = entrada.nextInt();

            if (numero!=-1){
                System.out.println("tabla de multiplicar del " +numero+ ":");
                for (int i = 1; i <=10 ; i++) {
                    int resultado=numero * i;
                    System.out.println(numero+ " x " +i+ " = " + resultado);
                }
            }
        }while (numero!= -1);
    }
}