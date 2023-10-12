package T6.n1ex1;

public class NoGenericMethods {
    Object uno = new Object();
    Object dos = new Object();
    Object tres = new Object();

    public NoGenericMethods(Object uno, Object dos, Object tres) {
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
    }

    public Object getUno() {
        return uno;
    }

    public void setUno(Object uno) {
        this.uno = uno;
    }

    public Object getDos() {
        return dos;
    }

    public void setDos(Object dos) {
        this.dos = dos;
    }

    public Object getTres() {
        return tres;
    }

    public void setTres(Object tres) {
        this.tres = tres;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "uno=" + uno +
                ", dos=" + dos +
                ", tres=" + tres +
                '}';
    }
}
