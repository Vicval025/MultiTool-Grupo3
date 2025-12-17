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
        System.out.println("A que unidad quieres convertir? (celsius/farenheit");
        sc.nextLine();
        String unidad=sc.nextLine();


        if(unidad.equalsIgnoreCase("celsius")){
            System.out.println("Dime la cantidad de fahrenheit");
            double F=sc.nextDouble();
            double C=(F - 32)/1.8;
            System.out.println("Resultado: "+C+" ºC");
        }else if(unidad.equalsIgnoreCase("fahrenheit")){
            System.out.println("Dime la cantidad de celsius");
            double C=sc.nextDouble();
            double F=(C * 1.8)+32;
            System.out.println("Resultado: "+F+" ºF");
        }else{
            System.out.println("Unidad no valida");
        }
    }
    }

    static void MetrosaPies(){
        Scanner sc = new Scanner (System.in);
    }
    static void KgaLibras(){
        Scanner sc = new Scanner (System.in);
    }
}

