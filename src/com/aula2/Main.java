package com.aula2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        /* referencia a um atributo*/
        c1.status();
        c1.rabiscar();
        /* referencia a metodo */

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
