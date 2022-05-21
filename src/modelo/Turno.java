
package modelo;
public class Turno {

    private int numeroTurno;
    private String accionEntrenador;
    private String accionRival;

    public Turno(int numTurno, String accionEnt, String accionRiv){
        this.numeroTurno = numTurno;
        this.accionEntrenador = accionEnt;
        this.accionRival = accionRiv;
    }

    public String getAccionEntrenador(){
        return accionEntrenador;
    }

    public String getAccionRival(){
        return accionRival;
    }
    
    public int getNumeroTurno() {
        return numeroTurno;
    }

    public void setAccionEntrenador(String accionEntrenador) {
        this.accionEntrenador = accionEntrenador;
    }
    
    public void setAccionRival(String accionRival) {
        this.accionRival = accionRival;
    }

    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

}

