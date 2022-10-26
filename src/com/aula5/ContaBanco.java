package com.aula5;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos personalizados
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t) {
        this.setTipo(t);
        //na linha 14 é utilizado o método
        this.setStatus(true);
        //na linha 16 é utilizado o acesso direto ao atributo
        //this.status = verdadeiro;
        if (t == "CC") {
            //na linha 19 mexe diretamente no atributo e na 20 eu mexo no método
            //this.saldo = 50;
            this.setSaldo(50);
        } else if (t == "CP"){
            //this.saldo = 150;
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void feharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, pois tem débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v); //método especial
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }

    //Métodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
        /* linhas que utilizam o método
        this.setSaldo(0);
        this.setStatus(false);
         */
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
