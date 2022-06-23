package com.lucas.estruturadados.vetor.teste;

import com.lucas.estruturadados.vetor.Vetor;

public class Aula05 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }

}
