
package entity;



public class Pronostico {
   
//Atributos
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultadoPro;
    private int puntosJugador = 0;
    
 
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

    @Override
    public String toString() {
        return "Pronostico{" + "partido=" + partido + ", equipo=" + equipo + ", resultado=" + resultadoPro + ", puntosJugador=" + puntosJugador + '}';
    }

   
    //Metodos    
    
    public int puntos(Pronostico resultadoPro, Partido resultadoPar){
        
        if(resultadoPro.equipo.equals(resultadoPar.getEquipo1())){
            if(resultadoPro.resultadoPro.equals(resultadoPar.resultado(resultadoPar.getEquipo1()))){
            resultadoPro.puntosJugador = resultadoPro.puntosJugador +1 ; 
            System.out.println("Se suma un total de " + puntosJugador);
              }
        }if(!resultadoPro.equipo.equals(resultadoPar.getEquipo1())) {
            System.out.println("No suma puntos");
        }
        if(resultadoPro.equipo.equals(resultadoPar.getEquipo2())){
            if(resultadoPro.resultadoPro.equals(resultadoPar.resultado(resultadoPar.getEquipo2()))){
            resultadoPro.puntosJugador = resultadoPro.puntosJugador +1 ; 
            System.out.println("Se suma un total de " + puntosJugador);
              }
        }if(!resultadoPro.equipo.equals(resultadoPar.getEquipo2())) {
            System.out.println("No suma puntos");
        }
        
        return puntosJugador;
     
    }
    
    
    
    
}
