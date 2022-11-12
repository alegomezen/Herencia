
package Entidad;
import java.util.Scanner;

public abstract class Electrodomestico {
    protected double precio;
    protected int peso;
    protected String eficiencia;
    protected String color;
    Scanner leer = new Scanner(System.in);
    public Electrodomestico() {
    }

    public Electrodomestico(double precio, int peso, String eficiencia, String color) {
        this.precio = 1000d;
        this.peso = peso;
        this.eficiencia = eficiencia;
        this.color = color;
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
    public void comprobarEficiencia(Electrodomestico e, String letra){
        switch (letra) {
            case "A":
                e.setEficiencia(letra);
                break;
            case "B":
                e.setEficiencia(letra);
                break;
            case "C":
                e.setEficiencia(letra);
                break;
            case "D":
                e.setEficiencia(letra);
            case "F":
                e.setEficiencia(letra);
            default:
                e.setEficiencia("F");
        }
    }
    public void comprobarColor(Electrodomestico e, String color){
        switch (color) {
            case "Blanco":
                e.setColor(color);
                break;
            case "Negro":
                e.setColor(color);
                break;
            case "Rojo":
                e.setColor(color);
                break;
            case "Azul":
                e.setColor(color);
                break;
            case "Gris":
                e.setColor(color);
                break;
            default:
                e.setColor("Blanco");
        }
    }
    public abstract void crearElectrodomestico();
    
    public void precioFinal(Electrodomestico e){
        System.out.println("Ingrese el peso del electrodomestico: ");
        int peso = leer.nextInt();
        double precioPeso = 0;
        double precioEficiencia = 0;
        if (peso > 1 && peso < 20) {
            precioPeso = 100d;
        } else {
            if (peso > 20 && peso < 50) {
                precioPeso = 500d;
            } else {
                if (peso > 50 && peso < 80) {
                    precioPeso = 800d;
                } else {
                    if (peso > 80) {
                        precioPeso = 1000d;
                    }
                }
            }
        }
        e.setPeso(peso);
        e.setPrecio(e.getPrecio() + precioPeso);

        if (e.getEficiencia().equals("A")) {
            precioEficiencia = 1000d;
        } else {
            if (e.getEficiencia().equals("B")) {
                precioEficiencia = 800d;
            } else {
                if (e.getEficiencia().equals("C")) {
                    precioEficiencia = 600d;
                } else {
                    if (e.getEficiencia().equals("D")) {
                        precioEficiencia = 500d;
                    }else{
                        if(e.getEficiencia().equals("E")){
                            precioEficiencia = 300d;
                        }else{
                            if(e.getEficiencia().equals("F")){
                                precioEficiencia=100d;
                            }
                        }
                    }                   
                }
                
            }
        }
      e.setPrecio(e.getPrecio()+precioEficiencia);
      e.setPeso(peso);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", eficiencia=" + eficiencia + ", color=" + color + ", leer=" + leer + '}';
    }
    
}
