package GenericClassExample;

public class GenericBox<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void print() {
        System.out.println("T: "+ t.getClass().getName());
    }

    //generic method with type parameter
    public <U> void ispectTypeofTandU(U u) {
        System.out.println("T: "+ t.getClass().getName());
        System.out.println("U: "+ u.getClass().getName());
    }

}
