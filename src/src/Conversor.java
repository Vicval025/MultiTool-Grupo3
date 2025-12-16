import java.util.Scanner;
public class Conversor {
    static Scanner sc = new Scanner(System.in);


    static void inicializa() {

        int numero;

        do {
            System.out.println("1. Celcius <--> Fahrenheit");
            System.out.println("2. Metros <--> Pies");
            System.out.println("3. Kg <--> Libras");
            System.out.println("0. Volver");

            numero = sc.nextInt();

            switch (numero) {

                case 1:
                    CelciusyFahrenheit();
                    break;

                case 2:
                    MetrosaPies();
                    break;

                case 3:
                    KgaLibras();
                    break;

                case 0:
                    System.out.println("Saliendo...");

                default:
                    System.out.println("Opcion no valida");
                    break;


            }
        } while (numero != 0);


    }
    static void CelciusyFahrenheit(){

    }

    static void MetrosaPies(){
        Scanner sc = new Scanner (System.in);
    }
    static void KgaLibras(){
        Scanner sc = new Scanner (System.in);
    }
}

