package T6.n1ex1;

public class Main {

    public static void main (String[] args){

        String uno = "1";
        String dos = "2";
        String tres = "3";

        NoGenericMethods prueba1 = new NoGenericMethods(uno, dos, tres);
        NoGenericMethods prueba2 = new NoGenericMethods(dos, tres, uno);

        System.out.println(prueba1.getUno() + "\n" + prueba1.getDos() + "\n" + prueba1.getTres());
        System.out.println("Prueba dos" + "\n" + prueba2.getUno() + "\n" + prueba2.getDos() + "\n" + prueba2.getTres());
    }

    public static class NoGenericMethods {
        String uno = "uno";
        String dos = "dos";
        String tres = "tres";

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
}
