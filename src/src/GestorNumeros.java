public class GestorNumeros {
    import java.util.Scanner;

    public class GestorNumeros {

        static Scanner sc = new Scanner(System.in);
        static int[] numeros = new int[20];
        static int contador = 0; // cantidad de números almacenados

        public static void inicializar() {
            int seleccion;

            do {
                escribeMenu();
                System.out.println("Introduzca la opción");
                seleccion = sc.nextInt();

                switch (seleccion) {
                    case 1:
                        anadirNumero();
                        break;

                    case 2:
                        listarNumeros();
                        break;

                    case 3:
                        verMinMax();
                        break;

                    case 4:
                        buscarNumero();
                        break;

                    case 0:
                        System.out.println("Volviendo al menú principal...");
                        break;

                    default:
                        System.out.println("Introduzca una opción correcta");
                }
            } while (seleccion != 0);
        }

        // 1. Añadir número
        public static void anadirNumero() {
            if (contador < numeros.length) {
                System.out.println("Introduzca un número:");
                numeros[contador] = sc.nextInt();
                contador++;
                System.out.println("Número añadido correctamente");
            } else {
                System.out.println("El array está lleno (máx 20 números)");
            }
        }

        // 2. Listar números
        public static void listarNumeros() {
            if (contador == 0) {
                System.out.println("No hay números almacenados");
            } else {
                System.out.println("Números guardados:");
                for (int i = 0; i < contador; i++) {
                    System.out.print(numeros[i] + " ");
                }
                System.out.println();
            }
        }

        // 3. Ver mínimo y máximo
        public static void verMinMax() {
            if (contador == 0) {
                System.out.println("No hay números para analizar");
            } else {
                int min = numeros[0];
                int max = numeros[0];

                for (int i = 1; i < contador; i++) {
                    if (numeros[i] < min) {
                        min = numeros[i];
                    }
                    if (numeros[i] > max) {
                        max = numeros[i];
                    }
                }

                System.out.println("Mínimo: " + min);
                System.out.println("Máximo: " + max);
            }
        }

        // 4. Buscar número
        public static void buscarNumero() {
            if (contador == 0) {
                System.out.println("No hay números almacenados");
            } else {
                System.out.println("Introduzca el número a buscar:");
                int buscado = sc.nextInt();
                boolean encontrado = false;

                for (int i = 0; i < contador; i++) {
                    if (numeros[i] == buscado) {
                        System.out.println("Número encontrado en la posición " + i);
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Número no encontrado");
                }
            }
        }

        public static void escribeMenu() {
            System.out.println("====================================");
            System.out.println("GESTOR DE NÚMEROS");
            System.out.println("1- Añadir número");
            System.out.println("2- Listar números");
            System.out.println("3- Ver mínimo y máximo");
            System.out.println("4- Buscar número");
            System.out.println("0- Volver");
        }
    }

}