package T2.n1ex1;

public class VentaBuidaException extends Exception {
    static String mensaje = "Para hacer una venta primero debes añadir productos";

    public VentaBuidaException () {
        super();
        getMensaje();
    }

    public static String getMensaje() {
        return mensaje;
    }
}

