
package ejercicio1guia10;
import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Perro;
import Entidad.Gato;

public class Ejercicio1Guia10 {

    
    public static void main(String[] args) {
        Animal p = new Perro("Rocky","Omnivoro","Doberman",9);
        p.mostrarAlimento();
        Animal g = new Gato("Milo","Omnivoro","Naranja",2);
        g.mostrarAlimento();
        Animal c = new Caballo("Rambo","Herbivoro","Escoces",12);
        c.mostrarAlimento();
    }
    
}
