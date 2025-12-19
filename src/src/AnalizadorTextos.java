import  java.util.Scanner;
public class AnalizadorTextos {
    static Scanner kbd = new Scanner(System.in);
    public static void inicializar(){
        /*Crear Submenú y implementar:

        1 Contar vocales
        2 Contar palabras
        3 Palabra más larga
        4 Volver
        Se trabaja con String, bucles y comparaciones.*/
        int seleccion = -1;
        do {
            String s = "Esto es una prueba de gestor de textos";
            escribeMenu();
            System.out.println("Introduzca la opción");
            seleccion = kbd.nextInt();
            switch (seleccion) {
                case 1:
                    vocales(s);
                    break;

                case 2:
                    contarPalabras(s);
                    break;

                case 3:
                    palabraLarga(s);
                    break;

                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Introduzca una opción correcta");
                    break;
            }
        }while (seleccion != 0);

    }

    public static void vocales(String s){
        int vocales = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'a'||s.toLowerCase().charAt(i)=='e'||s.toLowerCase().charAt(i)=='i'||s.toLowerCase().charAt(i)=='o'||s.toLowerCase().charAt(i)=='u') {
                vocales++;
            }
        }
        System.out.println("Cantidad de vocales: "  + vocales);
    }

    public static void contarPalabras(String s){
        int contador = 0;
        for (int i = 0; i< s.length();i++){
            if(s.trim().toLowerCase().charAt(i)==' '||i==s.length()-1){
                contador++;
            }
        }
        System.out.println("Cantidad de palabras: "  + contador);
    }

    public static void palabraLarga(String s ){
        if(s.trim().equals("")||s.length()==0){
            System.out.println("Palabra más larga: No hay palabras");
        }else{
            String palabraActual = "";
            int maxLength = 0;
            String palabraMaxima = "";

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);

                if( c!=' '){
                    palabraActual += c;
                } else{
                    if(palabraActual.length()>maxLength){
                        palabraMaxima = palabraActual;
                        maxLength = palabraMaxima.length();
                    } else if (palabraActual.length()==maxLength) {
                        palabraMaxima+= ", " + palabraActual;
                    }
                    palabraActual="";
                }
                if(palabraActual.length()>maxLength){
                    palabraMaxima = palabraActual;
                } else if (palabraActual.length()==maxLength) {
                    palabraMaxima+= ", " + palabraActual;
                }
            }
            System.out.println("Palabra más larga: " + palabraMaxima);
        }
    }

    public static void escribeMenu() {
        System.out.println("====================================");
        System.out.println("1- Contar vocales");
        System.out.println("2- Contar palabras");
        System.out.println("3- Palabra más larga");
        System.out.println("4- Volver");
    }

}