package DesignPatterns.FacadeCasa;

public class FacadeCasa {
    private SistemaHidraulico sistemaHidraulico;
    private SistemaEletrico sistemaEletrico;
    private  SistemaEletronico sistemaEletronico;

    public FacadeCasa(){
        this.sistemaEletrico = new SistemaEletrico();
        this.sistemaHidraulico = new SistemaHidraulico();
        this.sistemaEletronico = new SistemaEletronico();
    }

    public void ligarCasa(){
        this.sistemaEletronico.ligar();
        this.sistemaHidraulico.ligar();
        this.sistemaEletrico.ligar();
    }
    public void desligarCasa(){
        this.sistemaEletronico.desligar();
        this.sistemaHidraulico.desligar();
        this.sistemaEletrico.desligar();
    }

}
