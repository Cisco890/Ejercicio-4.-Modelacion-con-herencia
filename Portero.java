/** Juan Francisco Martínez 23617

  * Portero
 
  * @param todo.lo.heredado.de.la.clase.jugador,mas,paradas.golrecibido,efectividad
  * @throws es la primera clase hija de jugador, es específica para los paorteros

  */
public class Portero extends Jugador {
    private int paradas;
    private int golrecibido;
    private float efectividad;
    //Atributos únicos de la clase Portero

    public Portero (String nombre, String pais, int tipojugador, int faltas, int goldirect,  int tirolanza, int paradas, int golrecibido){
        super(nombre, pais, tipojugador, faltas, goldirect, tirolanza);
        this.paradas = paradas;
        this. golrecibido = golrecibido;
        this. efectividad = calcefectividad();
    }// Constructor del objeto Jugador, con los parámetros heredados y paradas, goles recibidos y efectividad


    public int getParadas() {
        return paradas;
    }

    
    public int getGolRecibido() {
        return golrecibido;
    }

    /**public float getEfectividad(){
        return efectividad;
   /**  }*/

    public float calcefectividad() {
        float paradasEfectivas = paradas - golrecibido;
        float totalLanzamientos = goldirect + tirolanza;

        if (totalLanzamientos == 0) {
            return 1; // Evitar división por cero
        }

        return efectividad = ((paradasEfectivas - golrecibido) * 100 / (paradasEfectivas + golrecibido)) + (goldirect * 100 / totalLanzamientos);
    }
}
    // se finalizan los getters del objeto portero

