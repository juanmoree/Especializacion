package T4.n1ex1;

import java.util.ArrayList;

public class Month {
    protected ArrayList<String> months;

    public Month() {

        this.months = new ArrayList<String>();
        months.add("Enero");
        months.add("Febrero");
        months.add("Marzo");
        months.add("Abril");
        months.add("Mayo");
        months.add("Junio");
        months.add("Julio");
        //months.add("Agosto");
        months.add("Septiembre");
        months.add("Octubre");
        months.add("Noviembre");
        months.add("Diciembre");
    }
    public ArrayList<String> getMonths() {
        return months;
    }

    public void setMonths(ArrayList<String> months) {
        this.months = months;
    }

    @Override
    public String toString() {
        return "Month [months=" + months + "]";
    }
}
