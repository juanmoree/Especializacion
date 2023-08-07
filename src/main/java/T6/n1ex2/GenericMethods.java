package T6.n1ex2;

public class GenericMethods<T> {
    private T t;
    private T u;
    private T k;
    public GenericMethods(T t, T u, T k){
        this.t = t;
        this.u = u;
        this.k = k;
    }

    public void genericMethod(T t, T u, T k){
        System.out.println(getT() + " " + getU() + " " + getK());
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getU() {
        return u;
    }

    public void setU(T u) {
        this.u = u;
    }

    public T getK() {
        return k;
    }

    public void setK(T k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "GenericMethods{" +
                "t=" + t +
                ", u=" + u +
                ", k=" + k +
                '}';
    }
}
