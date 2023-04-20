package br.edu.unilavras.designpatterns.builder.teste;

import br.edu.unilavras.designpatterns.builder.model.CarroProduct;
import br.edu.unilavras.designpatterns.builder.model.ConcessionariaDirector;
import br.edu.unilavras.designpatterns.builder.model.FiatBuilder;
import br.edu.unilavras.designpatterns.builder.model.VolksBuilder;

public class Cliente {
    public static void main(String[] args) {
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(
                new FiatBuilder());

        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
                + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);

        System.out.println();

        concessionaria = new ConcessionariaDirector(new VolksBuilder());
        concessionaria.construirCarro();
        carro = concessionaria.getCarro();
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
                + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);
    }
}

