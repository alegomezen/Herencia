package Entidad;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void mostrarAlimento() {
        System.out.println("Mi gato se alimenta de Whiskas.");
    }

}
