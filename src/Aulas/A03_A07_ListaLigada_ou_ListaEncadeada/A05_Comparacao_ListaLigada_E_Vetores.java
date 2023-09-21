package Aulas.A03_A07_ListaLigada_ou_ListaEncadeada;

import Aulas.A03_A07_ListaLigada_ou_ListaEncadeada.A03_A04_ListaLigada_ou_ListaEncadeada.ListaLigada;

import java.util.ArrayList;

public class A05_Comparacao_ListaLigada_E_Vetores {
    public static void main(String[] args) {

        ListaLigada<Integer> lista = new ListaLigada<>();

        ArrayList<Integer> vetor = new ArrayList<>();

        //Adição de elementos
        //Vetor
        int limite = 1000000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        for(int i = 0; i < limite; i++) {
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " elementos no vetor");
        System.out.println("Tempo: " + (tempoFinal - tempoInicial));

        //Lista Ligada
        tempoInicial = System.currentTimeMillis();

        for(int i = 0; i < limite; i++) {
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " elementos na lista");
        System.out.println("Tempo: " + (tempoFinal - tempoInicial));

        //Ler valores
        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < limite; i++) {
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de leitura do vetor");
        System.out.println("Tempo: " + (tempoFinal - tempoInicial));

        tempoInicial = System.currentTimeMillis();
        A07_Iterator_ListLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()) {
            iterator.getProximo();
        }


        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de leitura da lista");
        System.out.println("Tempo: " + (tempoFinal - tempoInicial));
    }
}
