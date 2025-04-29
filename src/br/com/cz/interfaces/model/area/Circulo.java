package br.com.cz.interfaces.model;

import br.com.cz.interfaces.contrato.IAreaCalculavel;

public class Circulo implements IAreaCalculavel {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
