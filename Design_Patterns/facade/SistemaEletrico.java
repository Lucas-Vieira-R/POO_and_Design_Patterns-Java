package DesignPatterns.FacadeCasa;

public class SistemaEletrico {
    private int voltagem;

    public SistemaEletrico(){
        this.voltagem = 110;
    }

    public void ligar(){
        System.out.println("O sistema eletrico está ligado");
    }

    public void desligar(){
        System.out.println("O sistema eletrico está desligado");
    }


    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return this.voltagem;
    }
}
