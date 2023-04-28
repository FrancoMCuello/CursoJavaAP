
package entity;


public class Partido {
    
   private String nombrePar;
   private Equipo equipo1; 
   private Equipo equipo2; 
   private int golesEquipo1;
   private int golesEquipo2; 
   
   //Constructor

   
    public Partido() {
    }

    public Partido(String nombrePar, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.nombrePar = nombrePar;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    
   
    //Getters && Setters
    
     public String getNombrePar() {
        return nombrePar;
    }

    
    public void setNombrePar(String nombrePar) {
        this.nombrePar = nombrePar;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
    
    //toString

    @Override
    public String toString() {
        return "Partido " + nombrePar + ", equipo1= " + equipo1 + ", golesEquipo1= " + golesEquipo1 + ", equipo2= " + equipo2 + ", golesEquipo2= " + golesEquipo2 +"\n";
    }

   
  
    
    //Metodos
    
    public void resultadoPartido(){
           if(getGolesEquipo1()>getGolesEquipo2()){
            getEquipo1().setDescripcion(ResultadoEnum.ganador);
            getEquipo2().setDescripcion(ResultadoEnum.perdedor);
        } if (getGolesEquipo1()<getGolesEquipo2()){
            getEquipo1().setDescripcion(ResultadoEnum.perdedor);
            getEquipo2().setDescripcion(ResultadoEnum.ganador);
        } if (getGolesEquipo1() == getGolesEquipo2()){ 
            getEquipo1().setDescripcion(ResultadoEnum.empate);
            getEquipo2().setDescripcion(ResultadoEnum.empate);        
        }
    }
        
    public ResultadoEnum resultado(Equipo equipo1){
    ResultadoEnum resul = equipo1.getDescripcion();
    System.out.println(equipo1 + " fue un " + resul);
    return resul;
    
    }
    
    
    
    }
    

