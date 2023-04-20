package br.edu.unilavras.designpatterns.state.test;

import br.edu.unilavras.designpatterns.state.model.Mario;

public class Cliente {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.pegarCogumelo();
        mario.pegarPena();
        mario.levarDano();
        mario.pegarFlor();
        mario.pegarFlor();
        mario.levarDano();
        mario.levarDano();
        mario.pegarPena();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
    }
}

