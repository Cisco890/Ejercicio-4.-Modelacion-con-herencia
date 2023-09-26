/** Juan Francisco Martínez 23617
  * Campeonato
 
  * @param Portero,Extremo,Jugador
  * @throws Es el main del programa, aca se realiza todo

  */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Campeonato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Portero[] porteros = new Portero[10]; // Array de porteros, cantidad máxima de 10
        Extremo[] extremos = new Extremo[10]; // Array to extremos, cantidad máxima de 10 

        int porteroCount = 0; // llevar control de cantidad de porteros
        int extremoCount = 0; // llevar control de cantidad de extremos

        while (true) { // atributos del menú
            System.out.println("Menú:");
            System.out.println("1. Ingresar datos del jugador");
            System.out.println("2. Estadísticas de porteros");
            System.out.println("3. Estadísticas de extremos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {// inicio del switch
                case 1:
                    System.out.print("Nombre del jugador: ");
                    String nombre = scanner.nextLine();
                    System.out.print("País de origen: ");
                    String pais = scanner.nextLine();
                    System.out.print("Faltas cometidas (en números): ");
                    int faltas = scanner.nextInt();
                    System.out.print("Goles directos (en números): ");
                    int goldirect = scanner.nextInt();
                    System.out.print("Tiros realizados (en números): ");
                    int tirolanza = scanner.nextInt();
                    System.out.print("Tipo de jugador (1 para portero, 2 para extremo): ");
                    int tipojugador = scanner.nextInt();
                    scanner.nextLine(); // Fin de los datos de la clase Jugador, se inicia un if para separar clase Portero y Extremo

                    if (tipojugador == 1) {// Atributos únicos de la clase portero
                        System.out.print("Paradas realizadas (en números): ");
                        int paradas = scanner.nextInt();
                        System.out.print("Goles recibidos (en números): ");
                        int golrecibido = scanner.nextInt();
                        System.out.print("Efectividad (en números): ");

                        // Creación del objeto portero y meterlo al array 
                        porteros[porteroCount] = new Portero(nombre, pais, tipojugador, faltas, goldirect, tirolanza, paradas, golrecibido);
                        porteroCount++; 
                    } else if (tipojugador == 2) {// Atributos únicos de la clase extremo
                        System.out.print("Pases realizados (en números): ");
                        int pases = scanner.nextInt();
                        System.out.print("Asistencias (en números): ");
                        int asist = scanner.nextInt();
                        scanner.nextLine(); 

                        // Creación del objeto extremo y meterlo al array 
                        extremos[extremoCount] = new Extremo(nombre, pais, tipojugador, faltas, goldirect, tirolanza, pases, asist);
                        extremoCount++; 
                    } else {
                        System.out.println("Tipo de jugador no válido.");
                    }
                    break;
                case 2:
                    // Quitar los datos Null
                    Portero[] nonNullPorteros = Arrays.stream(porteros)
                            .filter(Objects::nonNull)
                            .toArray(Portero[]::new);

                    // Ordenar los porteros por efectividad
                    Arrays.sort(nonNullPorteros, Comparator.comparing(Portero::calcefectividad).reversed());

                    // Lógica para mostrar a los 3 mejores porteros
                    System.out.println("Los 3 mejores porteros según su efectividad son:");
                    for (int i = 0; i < Math.min(3, nonNullPorteros.length); i++) {
                        Portero portero = nonNullPorteros[i];
                        System.out.println("Nombre: " + portero.getNombre());
                        System.out.println("Efectividad: " + portero.calcefectividad());
                        System.out.println("-----------------------");
                    }
                    break;
                    
                case 3:// Lógica para obtener los extremos con más de 85 de media 
                    int extremos85 = 0;

                    for (int i = 0; i < extremoCount; i++) {
                        Extremo extremo = extremos[i];
                        float efectividad = extremo.efectividad();
                    
                        if (efectividad >= 85.0f) {
                            extremos85++;
                        }
                    }
                    
                    System.out.println("Cantidad de extremos con un 85% o más de efectividad: " + extremos85);
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    System.exit(0); // fin del programa
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}