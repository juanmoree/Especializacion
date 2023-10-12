package T7.n1ex2;

public class TrabajadorOnline extends Trabajador{
    private final double tarifaPlana;
    public TrabajadorOnline(String nombre, String apellido, double precioHora, double tarifaPlana) {
        super(nombre, apellido, precioHora);
        this.tarifaPlana = tarifaPlana;
    }

    @Override
    public double calcularSueldo(int horasTrabajadasMes){
        return (horasTrabajadasMes * getPrecioHora()) + tarifaPlana;
    }

    @Deprecated
    public double retornarTarifaPlana(){
        return this.tarifaPlana;
    }
}
