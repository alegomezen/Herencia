
package Entidad;
import java.util.Scanner;

public class Polideportivo extends Edificio {
    private String tipo;
    Scanner leer = new Scanner(System.in);
    
    public Polideportivo(String tipo, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.tipo = tipo;
    }

    public Polideportivo(double alto, double ancho, double largo) {
        super(alto, ancho, largo);
    }

      
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void calcularSuperficie() {
        System.out.println();
    }

    @Override
    public void calcularVolumen() {
    }

    
    
    
    
}
