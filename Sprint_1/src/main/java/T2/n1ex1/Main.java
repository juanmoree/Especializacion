
package T2.n1ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Venta venta1 = new Venta();
        Producto producto1 = new Producto(3.5);
        Producto producto2 = new Producto(4);
        Producto producto3 = new Producto(8);

        ArrayList<Producto> productos = new ArrayList<Producto>();

        // Si no hay productos, genera excepcion, de lo contrario, calcula el valor de
        // todos los productos agregados.

		/*venta1.getProductos().add(producto1);
		venta1.getProductos().add(producto2);
		venta1.getProductos().add(producto3);*/

        try {
            Venta.calcularTotal();
        } catch (VentaBuidaException e) {
            System.out.println(VentaBuidaException.getMensaje());
        }
    }
}
