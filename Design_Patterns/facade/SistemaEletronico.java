package DesignPatterns.FacadeCasa;

public class SistemaEletronico {
    private boolean ligado;

    public SistemaEletronico() {
        this.ligado = false; // valor padrão para o sistema eletrônico desligado
    }

    public void ligar() {
        System.out.println("Sistema eletrônico ligado.");
        this.ligado = true;
        conectarInternet();
    }

    public void desligar() {
        System.out.println("Sistema eletrônico desligado.");
        this.ligado = false;
        desconectarInternet();
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void conectarInternet() {
        System.out.println("Conexão à Internet estabelecida.");
    }
    public void desconectarInternet() {
        System.out.println("Conexão à Internet cortada.");
    }
}
