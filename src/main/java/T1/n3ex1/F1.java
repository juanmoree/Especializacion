package T1.n3ex1;

public class F1 extends Noticia{
    protected String escuderia;

    public F1(String titular, String escuderia) {

        super(titular);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "F1{" +
                "escuderia='" + escuderia + '\'' +
                '}';
    }
}
