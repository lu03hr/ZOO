package models;

public class Elefante extends Animal {
    public Elefante(String name) {
        super(name);

    }

    @Override
    public void hacerSonido() {
        System.out.println("Barrruuuu");
    }
}
