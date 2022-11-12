
package Entidad;


public abstract class Electrodomestico {
    protected String color;
    protected String eficiencia;
    protected double precio;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, String eficiencia, double precio, int peso) {
        this.color = color;
        this.eficiencia = eficiencia;
        this.precio = precio;
        this.peso = peso;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
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
    public abstract void comprobarEficiencia(Electrodomestico e, String letra);
    public abstract void comprobarColor(Electrodomestico e, String color);
    public Electrodomestico crearElectrodomestico(){
        
    }
    public abstract void precioFinal(Electrodomestico e);
    
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "color=" + color + ", eficiencia=" + eficiencia + ", precio=" + precio + ", peso=" + peso + '}';
    }
    
}
