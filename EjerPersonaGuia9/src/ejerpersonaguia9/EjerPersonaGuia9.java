
package ejerpersonaguia9;
import Entidad.Dni;
import Entidad.Persona;
import java.util.Scanner;
public class EjerPersonaGuia9 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Dni dni = new Dni();
        dni.setCaracter("A");
        dni.setNumero(42203417);
        Persona persona1 = new Persona();
        persona1.setNombre("Alejandro");
        persona1.setApellido("Gomez Enriquez");
        persona1.setDni(dni);
        System.out.println("Hola! Soy "+persona1.getNombre()+" "+persona1.getApellido()+" y mi documento ");
        System.out.println("es "+dni.getNumero()+" clase "+dni.getCaracter()+".");
    }
    
}
