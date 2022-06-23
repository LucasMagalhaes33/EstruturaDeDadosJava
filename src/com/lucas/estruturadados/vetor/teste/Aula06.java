package com.lucas.estruturadados.vetor.teste;

import com.lucas.estruturadados.vetor.Vetor;

public class Aula06 {

    public static void main(String[] args) {

        try {
            Vetor vetor = new Vetor(10);

            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");

            System.out.println(vetor.busca(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
