
package Entidad;
import Interfaces.calculosFormas;

public class Circulo implements calculosFormas{
    private double radio;
    private double diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public double calcularArea() {
        double area;
        area=calculosFormas.PI*(Math.pow(radio, 2));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro=calculosFormas.PI*(diametro);
        return perimetro;
    }
    
}
