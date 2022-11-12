
package Entidad;


public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void mostrarAlimento() {
        System.out.println("El caballo se alimenta de heno y alimento balanceado.");
    }
    
}
