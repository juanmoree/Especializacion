package T1.n3ex1;

public class Noticia {

    private String titular;
    private String texto;
    private int puntuacion;
    private double precio;

    public Noticia(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPuntuacion(Noticia noticia) {
        return calcularPuntuacionNoticia(noticia);
    }

    public double getPrecio(Noticia noticia) {
        return calcularPrecioNoticia(noticia);
    }

    public double calcularPrecioNoticia(Noticia noticia) {
        double precioFinal = 0;

        // Noticias de futbol
        if (noticia instanceof Futbol) {
            precioFinal += 300;
            if (((Futbol) noticia).competicion.equalsIgnoreCase("liga de campeones")) {
                precioFinal += 100;
            }
            if (((Futbol) noticia).club.equalsIgnoreCase("barça") || ((Futbol) noticia).club.equalsIgnoreCase("madrid")) {
                precioFinal += 100;
            }
            if (((Futbol) noticia).jugador.equalsIgnoreCase("ferran torres") || ((Futbol) noticia).jugador.equalsIgnoreCase("benzema")) {
                precioFinal += 50;
            }
        }

        // Noticias de baloncesto
        if (noticia instanceof Baloncesto) {
            precioFinal += 250;
            if (((Baloncesto) noticia).competicion.equalsIgnoreCase("euroliga")) {
                precioFinal += 75;
            }
            if (noticia.getTexto().toLowerCase().contains("barça") || noticia.getTexto().toLowerCase().contains("madrid")) {
                precioFinal += 75;
            }
        }

        // Noticias de tenis
        if (noticia instanceof Tenis) {
            precioFinal += 150;
            if (((Tenis) noticia).tenista.equalsIgnoreCase("federer") ||
                    ((Tenis) noticia).tenista.equalsIgnoreCase("nadal") ||
                    ((Tenis) noticia).tenista.equalsIgnoreCase("djokovic")) {
                precioFinal += 100;
            }
        }

        // Noticias de F1
        if (noticia instanceof F1) {
            precioFinal += 100;
            if (((F1) noticia).escuderia.equalsIgnoreCase("ferrari") ||
                    ((F1) noticia).escuderia.equalsIgnoreCase("mercedes")) {
                precioFinal += 50;
            }
        }

        // Noticias de motociclismo
        if (noticia instanceof Motociclismo) {
            precioFinal += 100;
            if (((Motociclismo) noticia).equipo.equalsIgnoreCase("honda") ||
                    ((Motociclismo) noticia).equipo.equalsIgnoreCase("yamaha")) {
                precioFinal += 50;
            }
        }

        return precioFinal;
    }

    public int calcularPuntuacionNoticia(Noticia noticia) {
        int puntuacionFinal = 0;

        // Noticias de futbol
        if (noticia instanceof Futbol) {
            puntuacionFinal += 5;
            if (((Futbol) noticia).competicion.equalsIgnoreCase("liga de campeones")) {
                puntuacionFinal += 3;
            }
            if (((Futbol) noticia).competicion.equalsIgnoreCase("liga")) {
                puntuacionFinal += 2;
            }
            if (((Futbol) noticia).club.equalsIgnoreCase("barça") ||
                    ((Futbol) noticia).club.equalsIgnoreCase("madrid")) {
                puntuacionFinal += 1;
            }
            if (((Futbol) noticia).jugador.equalsIgnoreCase("ferran torres") ||
                    ((Futbol) noticia).jugador.equalsIgnoreCase("benzema")) {
                puntuacionFinal += 1;
            }
        }

        // Noticias de baloncesto
        if (noticia instanceof Baloncesto) {
            puntuacionFinal += 4;
            if (((Baloncesto) noticia).competicion.equalsIgnoreCase("euroliga")) {
                puntuacionFinal += 3;
            }
            if (((Baloncesto) noticia).competicion.equalsIgnoreCase("acb")) {
                puntuacionFinal += 2;
            }
            if (noticia.getTexto().toLowerCase().contains("barça") ||
                    noticia.getTexto().toLowerCase().contains("madrid")) {
                puntuacionFinal += 1;
            }
        }

        // Noticias de Tenis
        if (noticia instanceof Tenis) {
            puntuacionFinal += 4;
            if (((Tenis) noticia).tenista.equalsIgnoreCase("federer") ||
                    ((Tenis) noticia).tenista.equalsIgnoreCase("nadal") ||
                    ((Tenis) noticia).tenista.equalsIgnoreCase("djokovic")) {
                puntuacionFinal += 3;
            }
        }

        // Noticias de F1
        if (noticia instanceof F1) {
            puntuacionFinal += 4;
            if (((F1) noticia).escuderia.equalsIgnoreCase("ferrari") ||
                    ((F1) noticia).escuderia.equalsIgnoreCase("mercedes")) {
                puntuacionFinal += 2;
            }
        }

        // Noticias de motociclismo
        if (noticia instanceof Motociclismo) {
            puntuacionFinal += 3;
            if (((Motociclismo) noticia).equipo.equalsIgnoreCase("honda") ||
                    ((Motociclismo) noticia).equipo.equalsIgnoreCase("yamaha")) {
                puntuacionFinal += 3;
            }
        }

        return puntuacionFinal;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titular='" + titular + '\'' +
                ", texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                ", precio=" + precio +
                '}';
    }
}
