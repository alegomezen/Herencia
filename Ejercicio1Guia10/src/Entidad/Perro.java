package Entidad;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void mostrarAlimento() {
        System.out.println("Mi perro se alimenta de alimento balanceado Sieger criadores.");
    }

}
