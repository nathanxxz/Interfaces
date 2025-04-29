package br.com.cz.interfaces.model;

import br.com.cz.interfaces.contrato.IAreaCalculavel;

public class Retangulo implements IAreaCalculavel {
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
