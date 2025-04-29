package br.com.cz.interfaces.main;

import br.com.cz.interfaces.contrato.IAreaCalculavel;
import br.com.cz.interfaces.model.area.Circulo;
import br.com.cz.interfaces.model.area.Quadrado;
import br.com.cz.interfaces.model.area.Retangulo;

public class Teste {
    public static void main(String[] args) {
        IAreaCalculavel[] iAreaCalculave=new IAreaCalculavel[5];
        iAreaCalculave[0]=new Quadrado(2.5);
        iAreaCalculave[1]=new Quadrado(5.5);
        iAreaCalculave[2]=new Retangulo(2.5,15.55);
        iAreaCalculave[3]=new Circulo(9.9);
        iAreaCalculave[4]=new Circulo(7.7);

        for(int i=0;i< iAreaCalculave.length;i++){
            System.out.println(iAreaCalculave[i]);
        }






    }
}
