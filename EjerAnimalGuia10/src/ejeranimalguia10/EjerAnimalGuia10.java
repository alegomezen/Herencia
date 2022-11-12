
package ejeranimalguia10;
import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

public class EjerAnimalGuia10 {

   
    public static void main(String[] args) {
       ArrayList<Animal> lista = new ArrayList();
       Animal a = new Animal();
       Animal b = new Perro();
       Animal c = new Gato();
       lista.add(a);
       lista.add(b);
       lista.add(c);
        for (Animal aux : lista) {
            a.hacerRuido();
            b.hacerRuido();
            c.hacerRuido();
        } 
    }
    
}
