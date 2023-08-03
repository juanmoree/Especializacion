package T1.n3ex1;

public class Tenis extends Noticia {
    protected String competicion;
    protected String tenista;

    public Tenis(String titular, String competicion, String tenista) {

        super(titular);
        this.competicion = competicion;
        this.tenista = tenista;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getTenista() {
        return tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "competicion='" + competicion + '\'' +
                ", tenista='" + tenista + '\'' +
                '}';
    }
}
