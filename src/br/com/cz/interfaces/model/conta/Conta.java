package br.com.cz.interfaces.model;

abstract class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    public void depositarSaldo(double dep){
        this.saldo-=dep;
    }
    public void sacarSaldo(double sac){
        this.saldo+=sac;
    }
    public double obterSaldo(){
        return this.saldo;
    }

    @Override
    public String   toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
