package modelo;
public class MovimientoMejora {

    Mejora mejora;
    int turnosMejora;

    public void consumirEstaminaAtaque () {
        Pokemon.estamina =- turnosMejora*2;

    }
    
}
