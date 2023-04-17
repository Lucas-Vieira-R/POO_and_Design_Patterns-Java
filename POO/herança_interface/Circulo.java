package br.edu.unilavras.lab_5.Model;

public class Circulo implements FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return 3.14*(this.raio*this.raio);
    }
    public double calcularPerimetro(){
        return 2*3.14*this.raio;
    }

}
