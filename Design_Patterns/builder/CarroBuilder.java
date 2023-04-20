package br.edu.unilavras.designpatterns.builder.model;

public abstract class CarroBuilder {
    protected CarroProduct carro = new CarroProduct();
    public abstract void buildPreco();
    public abstract void buildDscMotor();
    public abstract void buildAnoDeFabricacao();
    public abstract void buildModelo();
    public abstract void buildMontadora();
    public CarroProduct getCarro(){
        return carro;
    };
}


