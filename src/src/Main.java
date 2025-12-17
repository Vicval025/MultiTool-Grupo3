import java.util.Scanner;

public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        do {
            printMenu();
            opcion = kbd.nextInt();
            switch (opcion) {
                case 1:
                    GestorNumeros.inicializar();
                    break;
                case 2:
                    Conversor.inicializa();
                    break;
                case 3:
                    AnalizadorTextos.inicializar();
                    break;
                case 4:
                    GestorTextos.tareas();
                    break;
                case 5:
                    Adivinador.inicializa();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Introduzca una opción correcta");
                    break;

            }
        }while(opcion != 0);
    }

    public static void printMenu(){
        System.out.println("MENÚ");
        System.out.println("1-Gestor de números");
        System.out.println("2-Conversor Multitipo");
        System.out.println("3-Analizador de textos");
        System.out.println("4-Gestor de tareas");
        System.out.println("5-Adivinar números");
        System.out.println("0- Salir");
        System.out.println("Introduzca una opcion(0-5):");
    }
}
