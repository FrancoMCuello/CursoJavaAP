
package entity;



public class Pronostico {
   
//Atributos
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultadoPro;
    private int puntosJugador;
    
 
//Constructores
    public Pronostico() {
    }

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultadoPro) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultadoPro = resultadoPro;
    }

  


//Getters && Setters

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado() {
        return resultadoPro;
    }

    public void setResultado(ResultadoEnum resultadoPro) {
        this.resultadoPro = resultadoPro;
    }

    public ResultadoEnum getResultadoPro() {
        return resultadoPro;
    }

    public void setResultadoPro(ResultadoEnum resultadoPro) {
        this.resultadoPro = resultadoPro;
    }

    public int getPuntosJugador() {
        return puntosJugador;
    }

    public void setPuntosJugador(int puntosJugador) {
        this.puntosJugador = puntosJugador;
    }
    
    

    @Override
    public String toString() {
        return "Pronostico{" + "partido=" + partido + ", equipo=" + equipo + ", resultado=" + resultadoPro + ", puntosJugador=" + puntosJugador + '}';
    }

   
    //Metodos    
    
    public int puntos(Pronostico resultadoPro, Partido resultadoPar){
        
        if(resultadoPro.equipo.equals(resultadoPar.getEquipo1())&&
           resultadoPro.resultadoPro.equals(resultadoPar.resultado(resultadoPar.getEquipo1())) || 
           resultadoPro.equipo.equals(resultadoPar.getEquipo2()) &&
           resultadoPro.resultadoPro.equals(resultadoPar.resultado(resultadoPar.getEquipo2()))){
           resultadoPro.puntosJugador = resultadoPro.puntosJugador +1 ; 
            System.out.println("Se suma un total de " + puntosJugador);
              }
        else{
            System.out.println("No suma puntos");
        }
        
        return puntosJugador;
     
    }
    
    
    
    
}
