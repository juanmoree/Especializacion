package T7.n1ex2;

public class TrabajadorPresencial extends Trabajador{
    private static double gasolina;
    public TrabajadorPresencial(String nombre, String apellido, double precioHora, double gasolina) {
        super(nombre, apellido, precioHora);
        TrabajadorPresencial.gasolina = gasolina;
    }

    @Override
    public double calcularSueldo(int horasTrabajadasMes) {
        return (getPrecioHora() * horasTrabajadasMes) + gasolina;
    }

    @Deprecated
    public double returnGasolinaa(){
        return gasolina;
    }
}
