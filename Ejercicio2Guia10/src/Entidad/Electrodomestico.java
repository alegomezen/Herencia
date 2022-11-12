package Entidad;

import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in);
    protected double precio;
    protected String consumoEnergetico;
    protected double peso;
    protected String color;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String consumoEnergetico, double peso, String color) {
        this.precio = precio;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Electrodomestico crearElectrodomestico();
    public abstract void comprobarConsumoElectrico();
    public abstract void comprobarColor();
    public abstract void precioFinal();
        

  

}
