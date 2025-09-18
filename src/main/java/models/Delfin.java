package models;

public class Delfin extends Animal {

    public Delfin(String name) {
        super(name);

    }

    @Override
    public void hacerSonido() {
        System.out.println("Clics, clics, clicssss");
    }
}
