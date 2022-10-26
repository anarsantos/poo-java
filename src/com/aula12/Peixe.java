package com.aula12;

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolhas() {
        System.out.println("Soltando Bolha.");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Soltou uma bolha.");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}