/** Juan Francisco Martínez 23617

  * Jugador
 
  * @param nombre,pais,tipojugador,faltas,goldirect,tirolanza
  * @throws Es la clase padre del programa. de esta clase se van a generar las dos hijas, portero y extremo, su función es la
  información general de los jugadores

  */// NOTA en el análisis está con clase Private pq se me olvidó cambiarlas a protected. 
  public class Jugador {
    protected String nombre;
    protected String pais;
    protected int tipojugador;
    protected int faltas;
    protected int goldirect;
    protected int tirolanza;
    //Atributos de la clase jugador, de tipo protected para poder ser accecibles para las hijas del programa

    protected Jugador (String nombre, String pais, int faltas, int goldirect,  int tirolanza, int tipojugador ){
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.goldirect = goldirect;
        this.tirolanza = tirolanza;
        this.tipojugador = tipojugador;
    }// Constructor del objeto Jugador, con los parámetros  nombre, pais, tipo de jugador, faltas, goles directos y tiros lanzados

    protected String getNombre() {
        return nombre;

    }

     protected String getPais() {
        return pais;

    }

     protected int getTipojugador() {
        return tipojugador;

    }

     protected int getFaltas() {
        return faltas;

    }

     protected int getGoldirect() {
        return goldirect;

    }

      protected int getTirolanza() {
        return tirolanza;

    }
   // se finalizan los getters del objeto jugador
}
