package br.edu.unilavras.lab_5.Model;

public class Quadrado implements FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return this.lado*this.lado;
    }
    public double calcularPerimetro(){
        return 4*this.lado;
    }
}
