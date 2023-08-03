package T1.n3ex1;

public class Motociclismo extends Noticia{
    protected String equipo;

    public Motociclismo(String titular, String equipo) {

        super(titular);
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Motociclismo{" +
                "equipo='" + equipo + '\'' +
                '}';
    }
}
