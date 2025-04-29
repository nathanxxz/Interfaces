package br.com.cz.interfaces.model.area;

import br.com.cz.interfaces.contrato.IAreaCalculavel;

public class Circulo implements IAreaCalculavel {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double pi=3.14;
        return pi*this.raio*this.raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio + "calcularArea=" + calcularArea() +
                '}';
    }
}
