package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Combate {
    private List<Turno> turnos;
    public static final String PATH="./log/combate.log";

    public Combate(){
        turnos = new LinkedList<>();
    }

    public List<Turno> getTurnos(){
        return turnos;
    }

    public void addTurno(Turno t){
        this.turnos.add(t);

    }

    public void escribirCombate(){
        File fichero = new File(PATH);
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Turno turno : turnos) {
                bw.write("Turno" + turno.getNumeroTurno() + ": \n");
                bw.write("Entrenador:" + turno.getAccionEntrenador() + "\n");
                bw.write("Rival:" + turno.getAccionRival() + "\n");
            }

            bw.close();

            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }


    

    
    
}
