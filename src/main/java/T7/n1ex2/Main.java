package T7.n1ex2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Trabajador trab1 = new Trabajador("Juan", "Moreno", 20);
        TrabajadorOnline trab2 = new TrabajadorOnline("Pepe", "Perez", 15, 50);
        TrabajadorPresencial trab3 = new TrabajadorPresencial("Carlos", "Calero", 30, 100);

        System.out.println("El sueldo total del trabajador " + trab1.getNombre() + " es: " + trab1.calcularSueldo(120));
        System.out.println("El sueldo total del trabajador " + trab2.getNombre() + " es: " + trab2.calcularSueldo(120));
        System.out.println("El sueldo total del trabajador " + trab3.getNombre() + " es: " + trab3.calcularSueldo(120));

        System.out.println(trab2.retornarTarifaPlana());
        System.out.println(trab3.returnGasolinaa());
    }
}
