package DesignPatterns.FacadeCasa;

public class SistemaHidraulico {
    private int pressao;

    public SistemaHidraulico(){
        this.pressao = 40;
    }
    public void ligar() {
        System.out.println("Sistema hidráulico ligado.");
    }

    public void desligar() {
        System.out.println("Sistema hidráulico desligado.");
    }

    public void setPressao(int pressao) {
        this.pressao = pressao;
    }

    public int getPressao() {
        return this.pressao;
    }
}
