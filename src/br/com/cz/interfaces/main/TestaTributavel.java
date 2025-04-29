package br.com.cz.interfaces.main;

import br.com.cz.interfaces.model.conta.ContaCorrente;
import br.com.cz.interfaces.model.conta.ContaPoupanca;
import br.com.cz.interfaces.model.conta.SeguroDeVida;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000.0);
        System.out.println("Saldo ContaCorrente: " + cc.obterSaldo());
        System.out.println("Tributos: " + cc.calculaTributos());

        ContaPoupanca cp = new ContaPoupanca(500.0);
        System.out.println("Saldo ContaPoupanca: " + cp.obterSaldo());

        SeguroDeVida sv = new SeguroDeVida(155.55);
        System.out.println("Tributo Seguro: " + sv.calculaTributos());
    }
}
