package models;

public class Pinguino extends Animal {

    public Pinguino( String name) {
        super(name);

    }

    @Override
    public void hacerSonido() {
        System.out.println("wa, wa, wa, waaaaa");
    }
}
