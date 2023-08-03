package T2.n1ex1;

import java.util.ArrayList;

public class Venta {
    static ArrayList<Producto> productos;
    private static double precioTotalVenta;

    public Venta() {
        productos = new ArrayList<Producto>();
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public double getPrecioTotalVenta() {
        return precioTotalVenta;
    }

    public static void calcularTotal() throws VentaBuidaException {
        if (productos.size() == 0) {
            throw new VentaBuidaException();
        } else {
            for (int i = 0; i < productos.size(); i++) {
                precioTotalVenta += productos.get(i).getPrecio();
            }
            System.out.println(precioTotalVenta);
        }
    }
}
