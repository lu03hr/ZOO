package models;

public class Perro extends Animal {
    public Perro(String name) {
        super(name);

    }

    @Override
    public void hacerSonido() {
        System.out.println("Guauuuuu");
    }

}