public class GestorTextos{
    public static void tareas(){
        Scanner sc = new Scanner(System.in);
        String [] tarea_array = new String[15];
        int eleccion_usuario;
        int contador=0;
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
                    Añadir_lista(eleccion_usuario);
                    break;
                case 2:
                    Listar_tarea(eleccion_usuario);
                    break;
                case 3:
                    Buscar_palabra(eleccion_usuario);
                    break;
                case 0:
                    System.out.println("Volver");
                default:
                    System.out.println("Número inválido");

            }
        }while(eleccion_usuario!=0);
    }
    static void Añadir_lista(int eleccion_usuario){
        if (eleccion_usuario==1){

        }
    }
    static void Listar_tarea(int eleccion_usuario){
        if (eleccion_usuario==2){

        }
    }
    static void Buscar_palabra(int eleccion_usuario){
        if (eleccion_usuario==3){

        }
    }
}