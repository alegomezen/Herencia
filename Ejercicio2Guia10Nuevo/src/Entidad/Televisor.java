
package Entidad;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    private double pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean sintonizador, double precio, int peso, String eficiencia, String color) {
        super(precio, peso, eficiencia, color);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
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

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    @Override
    public void crearElectrodomestico() {
        Televisor tv = new Televisor();
        int opcion;
        System.out.println("Ingrese el color del televisor: ");
        tv.setColor(leer.next());       
        System.out.println("Ingrese la resolución del televisor (en pulgadas): ");
        tv.setPulgadas(leer.nextDouble());
        System.out.println("Ingrese la eficiencia del televisor: ");
        tv.setEficiencia(leer.next());
        System.out.println("El televisor cuenta con un sintetizador: seleccione 1 (si) o 2 (no)");
        opcion=leer.nextInt();
        if(opcion==1){
            sintonizador=true;
        }else{
            sintonizador=false;
        }
        comprobarEficiencia(tv,tv.getEficiencia());
        comprobarColor(tv,tv.getColor());
        precioFinalTelevisor(tv);
    }
    public void precioFinalTelevisor(Televisor tv){
        precioFinal(tv);
        double precioPulgadas=0d;
        double precioSintonizador=0d;
        if(tv.getPulgadas()<40){
            precioPulgadas=0d;
        }else{
            precioPulgadas=0.30*(tv.getPrecio());
        }
        if(tv.isSintonizador()){
            precioSintonizador=500d;
        }else{
            precioSintonizador=0;
        }
       tv.setPrecio((tv.getPrecio()+precioPulgadas+precioSintonizador));
        System.out.println("El precio de su televisor es de: "+tv.getPrecio()+"$.");
    }

    @Override
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }
    
}
