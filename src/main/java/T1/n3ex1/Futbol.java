package T1.n3ex1;

public class Futbol extends Noticia {
    protected String competicion;
    protected String club;
    protected String jugador;

    public Futbol(String titular, String competicion, String club, String jugador) {

        super(titular);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Futbol{" +
                "competicion='" + competicion + '\'' +
                ", club='" + club + '\'' +
                ", jugador='" + jugador + '\'' +
                '}';
    }
}
