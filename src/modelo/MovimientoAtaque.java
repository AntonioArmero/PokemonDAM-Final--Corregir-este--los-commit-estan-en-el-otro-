package modelo;
public class MovimientoAtaque extends Movimiento {

    private int potenciaAtaque;
    
    public MovimientoAtaque(String nombreMovimiento, int idMovimiento, int getGastoEstamina, Tipo tipo1) {
        super(nombreMovimiento, idMovimiento, getGastoEstamina, tipo1);
    }

    public int getPotenciaAtaque() {
        return potenciaAtaque;
    }
}
