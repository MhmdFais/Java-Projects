package GenericClassExample;

public class App {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        integerBox.print();

        //GenericBox<String> stringBox = new GenericBox<>();
        //stringBox.set("Hello World");
        //stringBox.print();

        integerBox.ispectTypeofTandU("Hello World");

    }

}
