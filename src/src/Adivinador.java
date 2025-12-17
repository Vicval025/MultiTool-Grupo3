import java.util.Scanner;
public class Adivinador {
    static int intentosFinal = 0;
    static int seleccion = 0;
    static Scanner kbd = new Scanner(System.in);

    public static void inicializa() {
        //Crear un Submenú:
        //
        //    Volver
        //    El programa genera un número aleatorio (1–50).
        do {
            escribeMenu();
            System.out.println("Introduzca la opción");
            seleccion = kbd.nextInt();
            switch (seleccion) {
                case 1:
                    juega();
                    break;

                case 2:
                    intentosAnteriores();
                    break;

                case 3:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Introduzca una opción correcta");
                    break;
            }
        }while (seleccion != 3);
    }

    public static int generaAleatorio(){
        return  1 + (int)(Math.random()*51);
    }

    public static  void juega (){
        int intentos = 0;
        int aleatorio = generaAleatorio();
        int usuario = 0;
        do {
            System.out.println("Introduzca el número:");
            usuario = kbd.nextInt();

            if (usuario < aleatorio) {
                System.out.println("El número es mayor");
            } else if (usuario > aleatorio) {
                System.out.println("El número es menor");
            }else{
                System.out.println("¡Has acertado!");
            }

            intentos++;
        }while (usuario != aleatorio);
        intentosFinal = intentos;
    }

    public static void intentosAnteriores(){
        System.out.println("La partida anterior tardaste " + intentosFinal + " intentos");
    }

    public static void escribeMenu() {
        System.out.println("====================================");
        System.out.println("1- Jugar (Número entre 1 y 50)");
        System.out.println("2- Mostrar intentos del último juego");
        System.out.println("3- Volver");
    }
}