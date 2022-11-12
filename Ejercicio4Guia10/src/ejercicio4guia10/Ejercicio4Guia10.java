package ejercicio4guia10;
import Entidad.Circulo;
import Entidad.Rectangulo;
public class Ejercicio4Guia10 {

    public static void main(String[] args) {
      
      Circulo c = new Circulo();
      Rectangulo r = new Rectangulo();
      c.setRadio(2.5);
      c.setDiametro(2.5);
      r.setAltura(4.4);
      r.setBase(2.5);
      c.calcularArea();
      c.calcularPerimetro();
      r.calcularArea();
      r.calcularPerimetro();
    }

}
