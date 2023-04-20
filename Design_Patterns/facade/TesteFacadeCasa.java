package DesignPatterns.FacadeCasa;

public class TesteFacadeCasa {
    public static void main(String[] args) {
        FacadeCasa casa = new FacadeCasa();
        System.out.println("Ligando a casa, estabelecendo rede eletrica, hidraulica, internet:");
        casa.ligarCasa();
        System.out.println("\n");
        System.out.println("Desligando a casa:");
        casa.desligarCasa();
    }
}
