
package Entidad;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private int carga;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Lavadora() {
    }
    
    public Lavadora(int carga) {
        this.carga = carga;
    }
    
    public Lavadora(int carga, double precio, int peso, String eficiencia, String color) {
        super(precio, peso, eficiencia, color);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void crearElectrodomestico() {
        Lavadora lav = new Lavadora();
        System.out.println("Ingrese el color de la lavadora: ");
        lav.setColor(leer.next());       
        System.out.println("Ingrese la carga de la lavadora: ");
        lav.setCarga(leer.nextInt());
        System.out.println("Ingrese la eficiencia de la lavadora: ");
        lav.setEficiencia(leer.next());
        comprobarEficiencia(lav,lav.getEficiencia());
        comprobarColor(lav,lav.getColor());
        precioFinalLavadora(lav);
        System.out.println(lav.toString());
    }
    public void precioFinalLavadora(Lavadora lav){
        precioFinal(lav);
        if(lav.getCarga()>30){
            lav.setPrecio((lav.getPrecio()+500));
        }else{
            lav.setPrecio(lav.getPrecio());
        }
        System.out.println("El precio final de la lavadora es de: "+lav.getPrecio()+"$.");
    }

    

    

    
    


   
    
    
}
