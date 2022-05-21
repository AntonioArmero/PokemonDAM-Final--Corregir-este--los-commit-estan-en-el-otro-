package modelo;
public class MovimientoEstado {

    Estado estado;
    int turnosEstado;

    public void consumirEstaminaEstado () {
        Pokemon.estamina =- turnosEstado*2;

    }
    
    
}
