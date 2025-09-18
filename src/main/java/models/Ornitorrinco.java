package models;

public class Ornitorrinco extends Animal {
    public Ornitorrinco(String name) {
        super(name);

    }

    @Override
    public void hacerSonido() {
        System.out.println("GRRRRR");
    }

}
