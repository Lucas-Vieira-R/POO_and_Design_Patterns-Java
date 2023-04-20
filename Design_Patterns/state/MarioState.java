package br.edu.unilavras.designpatterns.state.model;

public interface MarioState {
    MarioState pegarCogumelo();

    MarioState pegarFlor();

    MarioState pegarPena();

    MarioState levarDano();
}

