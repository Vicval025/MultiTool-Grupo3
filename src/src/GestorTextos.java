public class GestorTextos{
    static Scanner sc = new Scanner(System.in);
    static String [] tarea_array = new String[15];
    static int eleccion_usuario;
    static int contador=0;
    public static void tareas(){
        do{
                System.out.println("1.Añadir tarea");
                System.out.println("2.Listar tarea");
                System.out.println("3.Buscar palabra");
                System.out.println("0.Volver");
                System.out.print("Elige una opción: ");
                eleccion_usuario = sc.nextInt();
                sc.nextLine();
            switch (eleccion_usuario) {
                case 1:
                    Añadir_lista();
                    break;
                case 2:
                    Listar_tarea();
                    break;
                case 3:
                    Buscar_palabra();
                    break;
                case 0:
                    System.out.println("Volver");
                default:
                    System.out.println("Número inválido");

            }
        }while(eleccion_usuario!=0);
    }
    static void Añadir_lista(){

    }
    static void Listar_tarea(){

    }
    static void Buscar_palabra(){

    }
}