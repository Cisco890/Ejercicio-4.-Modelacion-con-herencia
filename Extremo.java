/** Juan Francisco Martínez 23617

  * Extremo
 
  * @param todo.lo.heredado.de.la.clase.jugador,mas,pases.asist,efectividad
  * @throws es la segunda clase hija de jugador, es específica para los paorteros

  */
public class Extremo extends Jugador {
    private int pases;
    private int asist;
    private float efectividad;
    //Atributos únicos de la clase Extremo

    public Extremo (String nombre, String pais, int tipojugador, int faltas, int goldirect,  int tirolanza, int pases, int asist){
        super(nombre, pais, tipojugador, faltas, goldirect, tirolanza);
        this.pases = pases;
        this. asist = asist;
        this. efectividad = efectividad();
    }// Constructor del objeto Jugador, con los parámetros heredados y paradas, goles recibidos y efectividad


    public int getPases() {
        return pases;
    }

    
    public int getAsist() {
        return asist;
    }


   // public float getEfectividad(){
   //     return efectividad;
   // }
   
   public float efectividad() {
     float asistenciasEfectivas = pases + asist - faltas;
    float totalLanzamientos = goldirect + tirolanza;

    efectividad = ((asistenciasEfectivas - faltas) * 100 / (asistenciasEfectivas + faltas)) + (goldirect * 100 / totalLanzamientos);
    
    return efectividad;  // se finalizan los getters del objeto extremo
}
}