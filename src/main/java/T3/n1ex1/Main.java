package T3.n1ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Month enero = new Month("Enero");
        Month febrero = new Month("Febrero");
        Month marzo = new Month("Marzo");
        Month abril = new Month("Abril");
        Month mayo = new Month("Mayo");
        Month junio = new Month("Junio");
        Month julio = new Month("Julio");
        Month agosto = new Month("Agosto");
        Month septiembre = new Month("Septiembre");
        Month octubre = new Month("Octubre");
        Month noviembre = new Month("Noviembre");
        Month diciembre = new Month("Diciembre");

        ArrayList<Month> months = new ArrayList<Month>();

        months.add(enero);
        months.add(febrero);
        months.add(marzo);
        months.add(abril);
        months.add(mayo);
        months.add(junio);
        months.add(julio);
        months.add(septiembre);
        months.add(octubre);
        months.add(noviembre);
        months.add(diciembre);

        //Añadir en la posición correcta
        months.add(7, agosto);

        for (Month month : months) {
            System.out.print(month.getName() + " ");
        }
        System.out.println();

        Set<Month> months1 = new HashSet<Month>();

        //Creando duplicados
        months1.add(diciembre);
        months1.add(septiembre);

        //Convirtiendo de ArrayList a HashSet
        months1.addAll(months);

        //Recorriendo con for
        for (Month month : months1) {
            System.out.print(month.getName() + " ");
        }
        System.out.println();

        Iterator<Month> it = months1.iterator();

        //Recorriendo con iterador
        while(it.hasNext()) {
            System.out.print(it.next().getName() + " ");
        }

    }
}
