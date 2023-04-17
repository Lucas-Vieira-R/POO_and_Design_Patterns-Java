package br.edu.unilavras.lab_5.Test;

import br.edu.unilavras.lab_5.Model.Circulo;
import br.edu.unilavras.lab_5.Model.Quadrado;

public class Teste {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5.0);
        Circulo c1 = new Circulo(3.0);

        System.out.println("Area do circulo: "+c1.calcularArea());
        System.out.println("Perimetro do circulo: "+c1.calcularPerimetro());
        System.out.println("Area do quadrado: "+q1.calcularArea());
        System.out.println("Perimetro do quadrado: "+q1.calcularPerimetro());
    }
}
