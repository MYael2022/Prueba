import java.io.*;
//P
public class Numeros{
    public static BufferedReader entrada = 
          new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {

        int numero=0;
        int opcion;
        do{
            System.out.println(" 1. -Dar un numero \n"
                             + "2.-Salir \n");
       
            System.out.println("Su opcion es:");
             opcion= Integer.parseInt(entrada.readLine());


            switch(opcion)
            {
                case 1:
                    System.out.println("Dame un numero:");
                    numero= Integer.parseInt(entrada.readLine());
                    if (numero%2==0)
                        System.out.println("El número es par\n");
                    else
                        System.out.println("El número es impar\n");
                    break;
                case 2:
                    System.out.println("Gracias por participar!!\n");   
            }

        } while (opcion!=2);

    } 
}
