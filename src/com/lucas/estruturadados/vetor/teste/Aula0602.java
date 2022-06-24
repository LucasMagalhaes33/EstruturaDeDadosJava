package com.lucas.estruturadados.vetor.teste;

import com.lucas.estruturadados.vetor.Vetor;

public class Aula0602 {

    public static void main(String[] args) {

        Vetor vetor = null;
        try {
            vetor = new Vetor(3);

            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.buscar("elemento 3"));

    }

}
