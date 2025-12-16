public class GestorTextos{
    public static void tareas(){
        Scanner sc = new Scanner(System.in);
        String [] tarea_array = new String[15];
        int eleccion_usuario;
        int contador=0;
        do{
            do {
                System.out.println("1.Añadir tarea");
                System.out.println("2.Listar tarea");
                System.out.println("3.Buscar palabra");
                System.out.println("0.Volver");
                System.out.print("Elige una opción: ");
                eleccion_usuario = sc.nextInt();
                sc.nextLine();
            }while(eleccion_usuario<0 || eleccion_usuario>3)
            switch (eleccion_usuario){

            }


        }while(eleccion_usuario!=0);
    }
}