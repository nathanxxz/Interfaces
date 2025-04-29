package br.com.cz.interfaces.model.conta;

import br.com.cz.interfaces.contrato.ITributavel;

public class ContaCorrente extends Conta implements ITributavel {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        return obterSaldo()*0.1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
