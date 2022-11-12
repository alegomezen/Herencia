
package Entidad;
import Entidad.Electrodomestico;

public class Lavarropas extends Electrodomestico{
    private double carga;

    public Lavarropas() {
    }

    public Lavarropas(double carga, double precio, String consumoEnergetico, double peso, String color) {
        super(precio, consumoEnergetico, peso, color);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public Lavarropas crearElectrodomestico() {
        Lavarropas l = new Lavarropas();
        
        return l;
    }

    @Override
    public void comprobarConsumoElectrico() {
        String a;
        System.out.println("Ingrese la letra correspondiente al consumo electrico: ");
        a = leer.next();
        switch (a) {
            case "A":
                break;
            case "B":
                break;
            case "C":
                break;
            case "D":
                break;
            case "E":
                break;
            case "F":
                break;
            default:
         //       e.setConsumoEnergetico("F");

        }
      //  e.setConsumoEnergetico(a);
    }

    @Override
    public void comprobarColor() {
        String a;
        System.out.println("Indique el color del electrodomestico: ");
        a = leer.next();
        switch (a) {
            case "Blanco":
                break;
            case "Negro":
                break;
            case "Gris":
                break;
            case "Rojo":
                break;
            case "Azul":
                break;
            case "F":
                break;
            default:
             //   e.setConsumoEnergetico("Blanco");

        }
      //  e.setColor(a);
    }

    @Override
    public void precioFinal() {
        String a;
        double b;
        double precioEnergia = 0;
        double precioTamanio = 0;
      //  a = l.getConsumoEnergetico();
        switch (a) {
            case "A":
                precioEnergia = 1000;
                break;
            case "B":
                precioEnergia = 800;

                break;
            case "C":
                precioEnergia = 600;

                break;
            case "D":
                precioEnergia = 400;

                break;
            case "E":
                precioEnergia = 200;

                break;
            case "F":
                precioEnergia = 100;

                break;
        }
        System.out.println("Indique el peso del electrodomestico: ");
        b = leer.nextDouble();
        if (b > 1 && b < 19) {
            precioTamanio = 100;
        } else {
            if (b > 19 && b < 49) {
                precioTamanio = 500;
            } else {
                if (b > 49 && b < 79) {
                    precioTamanio = 800;
                } else {
                    if (b > 79) {
                        precioTamanio = 1000;
                    }
                }
            }
        }

        double precioFinal = 1000 + precioTamanio + precioEnergia;
       // l.setPrecio(precioFinal);
      //  l.setPeso(b);
      //  return l;
    }
    
}
