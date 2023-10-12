package T1.n3ex1;

public class Baloncesto extends Noticia{
    protected String competicion;
    protected String jugador;

    public Baloncesto(String titular, String competicion, String jugador) {

        super(titular);
        this.competicion = competicion;
        this.jugador = jugador;
    }

    public String getCompeticion() {
        return competicion;
    }

    public String getJugador() {
        return jugador;
    }

    @Override
    public String toString() {
        return "Baloncesto{" +
                "competicion='" + competicion + '\'' +
                ", jugador='" + jugador + '\'' +
                '}';
    }
}
