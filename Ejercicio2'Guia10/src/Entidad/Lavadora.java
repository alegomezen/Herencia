package Entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private double carga;

    Scanner leer = new Scanner(System.in);

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, String color, String eficiencia, double precio, int peso) {
        super(color, eficiencia, precio, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
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

    @Override
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

    @Override
    public Electrodomestico crearElectrodomestico() {
        Lavadora lav = new Lavadora();
        System.out.println("Ingrese la letra que corresponda a la eficiencia energetica: ");
        String letra1 = leer.next();
        lav.setPrecio(1000d);
        comprobarEficiencia(lav, letra1);
        System.out.println("Ingrese el color del electrodomestico: ");
        String letra2 = leer.next();
        comprobarColor(lav, letra2);
        
        return lav;
    }

    @Override
    public void precioFinal(Lavadora e) {
        System.out.println("Ingrese el peso de la lavadora: ");
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
                    } else {
                        if (e.getEficiencia().equals("E")) {
                            precioEficiencia = 300d;
                        } else {
                            if (e.getEficiencia().equals("F")) {
                                precioEficiencia = 100d;
                            }
                        }
                    }
                }

            }
        }
        e.setPrecio(e.getPrecio() + precioEficiencia);
        e.setPeso(peso);
        int precioCarga = 0;
        int precio = e.getPeso();
        System.out.println("Ingrese la carga de la lavadora: ");
        e.setCarga(leer.nextDouble());
        if (e.getCarga() < 30) {
            precioCarga = 0;
        } else {
            precioCarga = 500;
        }
        e.setPrecio(precio + precioCarga);
        System.out.println("El precio de la lavadora es de: " + e.getPrecio() + "$");
    }

    @Override
    public void precioFinal(Electrodomestico e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
