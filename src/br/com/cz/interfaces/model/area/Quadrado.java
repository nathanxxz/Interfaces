package br.com.cz.interfaces.model;

import br.com.cz.interfaces.contrato.IAreaCalculavel;

public class Quadrado implements IAreaCalculavel {
    private double lado;

    public Quadrado(double lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
