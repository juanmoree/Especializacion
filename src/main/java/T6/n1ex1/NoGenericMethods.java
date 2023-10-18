package T6.n1ex1;

public class NoGenericMethods {

    private String uno;
    private String dos;
    private String tres;

    public NoGenericMethods(String uno, String dos, String tres) {
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
    }

    public Object getUno() {
        return uno;
    }

    public void setUno(Object uno) {
        this.uno = (String) uno;
    }

    public Object getDos() {
        return dos;
    }

    public void setDos(Object dos) {
        this.dos = (String) dos;
    }

    public Object getTres() {
        return tres;
    }

    public void setTres(Object tres) {
        this.tres = (String) tres;
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
