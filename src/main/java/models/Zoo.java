package models;
import java.util.ArrayList;

public class Zoo {

        private String name;
        private ArrayList<Animal> listaAnimales;

        public Zoo(String name) {
            this.name = name;
            this.listaAnimales = new ArrayList<>();

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Animal> getListaAnimales() {
            return listaAnimales;
        }

        public void setListaAnimales(ArrayList<Animal> listaAnimales) {
            this.listaAnimales = listaAnimales;
        }


        /**
         * CREATE This method let you crate a new patient in case it did not exist in the system
         *
         * @param nuevoAnimal
         * @return
         */
        public String registrarNuevoAnimal(Animal nuevoAnimal) {
            String resultado = "";
            Animal animalEncontrado = null;
            animalEncontrado = buscarAnimal(nuevoAnimal.getName());
            if (animalEncontrado == null) {
                listaAnimales.add(nuevoAnimal);
                resultado = "El animal se ha registrado exitosamente";
            } else {
                resultado = "El animal ya esta registrada.";
            }
            return resultado;
        }

        /**
         * READ This method search for the pet in the list of patient
         *
         * @param name
         * @return
         */
        public Animal buscarAnimal(String name) {
            Animal animalEncontrado = null;
            for (Animal animal : listaAnimales) {
                if (animal.getName().equals(name)) {
                    animalEncontrado = animal;
                }
            }
            return animalEncontrado;
        }

        /**
         * UPDATE This method is used to update all the data but code of a pet
         * @param name
         * @return
         */
        public String actualizarAnimal( String name, Animal animalActualizado) {
            Animal animal = buscarAnimal(name);
            String resultado = "";
            if (animal != null) {
                animal.setName(animalActualizado.getName());
                resultado = "El animal ha sido actualizada exitosamente";
            } else {
                resultado = "El animal no hace parte del sistema, se recomienda registrarlo.";
            }
            return resultado;
        }

        /**
         * DELETE this method is used to delete one element of the system
         *
         * @param name
         * @return
         */
        public String eliminarAnimal(String name) {
            String resultado = "";
            Animal animal = buscarAnimal(name);
            if (animal != null) {
                listaAnimales.remove(animal);
                resultado = "El animal ya ha sido eliminada del sistema, gracias por contar con nuestros servicios";
            } else {
                resultado = "El animal no hace parte del sistema, por lo que no se puede eliminar";
            }
            return resultado;
        }

    public String listaAnimales() {
        String resultado = "";
        if (listaAnimales().isEmpty()) {
            resultado =("No hay animales registradas en el sistema");
        } else {
            for ( Animal animal : listaAnimales) {
                resultado += String.valueOf(animal);
                resultado += "\n";
            }
        }return resultado;
    }

    public void hacerSonidoTodos(){
            for(Animal animal : listaAnimales){
                animal.hacerSonido();
            }
    }
    }



