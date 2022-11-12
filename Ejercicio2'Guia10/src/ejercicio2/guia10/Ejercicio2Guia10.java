
package ejercicio2.guia10;
import Entidad.Electrodomestico;
import Service.ServiciosElectrodomestico;
import Service.ServicioLavadora;

public class Ejercicio2Guia10 {

    
    public static void main(String[] args) {
        ServiciosElectrodomestico serv1 = new ServiciosElectrodomestico();
        ServicioLavadora serv2 = new ServicioLavadora();
       // Electrodomestico e = serv1.crearElectrodomestico();
       // System.out.println(e.toString());
        serv2.crearLavadora();
        System.out.println(serv2.toString());
    }
     
}
