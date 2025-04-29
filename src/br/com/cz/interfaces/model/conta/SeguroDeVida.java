package br.com.cz.interfaces.model;

import br.com.cz.interfaces.contrato.ITributavel;

public class SeguroDeVida extends  Conta implements ITributavel {
    public SeguroDeVida(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        return 42;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
