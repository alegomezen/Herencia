package Service;

import Entidad.Lavadora;
import Entidad.Electrodomestico;
import Service.ServiciosElectrodomestico;
import java.util.Scanner;

public class ServicioLavadora extends ServiciosElectrodomestico {

    
    ServiciosElectrodomestico serv1 = new ServiciosElectrodomestico();

    public Electrodomestico crearLavadora() {
        Lavadora lav = new Lavadora();
        serv1.crearElectrodomestico();
        precioLavadora(lav);
        return lav;
    }
    public void precioLavadora(Lavadora lav){
        int precioCarga=0; 
        int precio = lav.getPeso();
        serv1.precioFinal(lav);
        System.out.println("Ingrese la carga de la lavadora: ");
        lav.setCarga(leer.nextDouble());         
        if(lav.getCarga()<30){
            precioCarga=0;
        }else{
            precioCarga=500;
        }
        lav.setPrecio(precio+precioCarga);
        System.out.println("El precio de la lavadora es de: "+lav.getPrecio()+"$");
    }

    @Override
    public void precioFinal(Electrodomestico e) {
        
        super.precioFinal(e); 
    }

    @Override
    public void comprobarColor(Electrodomestico e, String color) {
        super.comprobarColor(e, color); 
    }

    @Override
    public void comprobarEficiencia(Electrodomestico e, String letra) {
        super.comprobarEficiencia(e, letra); 
    }

    @Override
    public Electrodomestico crearElectrodomestico() {
        return super.crearElectrodomestico(); 
    }

    @Override
    public String toString() {
        return "ServicioLavadora{" + "serv1=" + serv1 + '}';
    }
    
}
