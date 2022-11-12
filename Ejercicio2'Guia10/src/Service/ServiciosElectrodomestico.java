package Service;

import Entidad.Electrodomestico;
import java.util.Scanner;

public class ServiciosElectrodomestico {

    Scanner leer = new Scanner(System.in);

    public Electrodomestico crearElectrodomestico() {
        ///Electrodomestico e = new Electrodomestico();
        System.out.println("Ingrese la letra que corresponda a la eficiencia energetica: ");
        String letra1 = leer.next();
        comprobarEficiencia(e, letra1);
        System.out.println("Ingrese el color del electrodomestico: ");
        String letra2 = leer.next();
        comprobarColor(e, letra2);       
        ///return e;
        
    }

    public void comprobarEficiencia(Electrodomestico e, String letra) {
        
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

    public void comprobarColor(Electrodomestico e, String color) {
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

    public void precioFinal(Electrodomestico e) {
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
}
