package br.com.cz.interfaces.model.area;

import br.com.cz.interfaces.contrato.IAreaCalculavel;

public class Quadrado implements IAreaCalculavel {
    private double lado;

    public Quadrado(double lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado + "calcularArea=" + calcularArea() +
                '}';
    }
}
