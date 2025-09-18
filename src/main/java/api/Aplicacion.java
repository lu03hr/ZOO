package api;

import models.*;

public class Aplicacion {
    public static void main(String[] args) {

        Zoo nuevoZoo = new Zoo("Baloo");
        Pinguino pingui = new Pinguino("Raul");
        Elefante elefante = new Elefante("Trompa");
        Perro perro = new Perro("Max");
        Ornitorrinco ornitorrinco = new Ornitorrinco("Perry el Ornitorrinco");
        Delfin delfin = new Delfin("delinicio");
        nuevoZoo.registrarNuevoAnimal(pingui);
        nuevoZoo.registrarNuevoAnimal(elefante);
        nuevoZoo.registrarNuevoAnimal(perro);
        nuevoZoo.registrarNuevoAnimal(ornitorrinco);
        nuevoZoo.registrarNuevoAnimal(delfin);
        nuevoZoo.hacerSonidoTodos();


    }



}
