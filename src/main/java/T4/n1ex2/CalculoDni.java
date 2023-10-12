package T4.n1ex2;

public class CalculoDni {
    public boolean calculo(String numDni) {
        boolean correcto = false;
        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };
        int length = numDni.length();
        char letraDni = Character.toUpperCase(numDni.charAt(length - 1));
        String num = numDni.substring(0, 8);
        int number = Integer.parseInt(num);
        int mod = number % 23;

        if (length != 9 || !Character.isLetter(letraDni)) {
            return correcto;
        }
        if (letras[mod] == letraDni) {
            correcto = true;
        }
        return correcto;
    }
}
