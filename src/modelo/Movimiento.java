package modelo;
public class Movimiento {

    private String nombreMovimiento;
    private int idMovimiento;
    protected int gastoEstamina;
    private Tipo tipo1;

    public Movimiento(String nombreMovimiento, int idMovimiento, int gastoEstamina, Tipo tipo){
        this.idMovimiento = idMovimiento;
        this.nombreMovimiento = nombreMovimiento;
        this.gastoEstamina = gastoEstamina;
        this.tipo1 = tipo;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public void setNombreMovimiento(String nombreMovimiento) {
        this.nombreMovimiento = nombreMovimiento;
    }

    public int getGastoEstamina() {
        return gastoEstamina;
    }

    public void setGastoEstamina(int gastoEstamina) {
        this.gastoEstamina = gastoEstamina;
    }

    public Tipo getTipo1() {
        return tipo1;
    }

    public void setTipo1(Tipo tipo1) {
        this.tipo1 = tipo1;
    }

    
}
