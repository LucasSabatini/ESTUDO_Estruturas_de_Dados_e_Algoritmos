package Aulas.A03_A07_ListaLigada_ou_ListaEncadeada;

import Aulas.A03_A07_ListaLigada_ou_ListaEncadeada.A03_A04_ListaLigada_ou_ListaEncadeada.*;

public class A06_ListaLigada_Inteiros {
    public static void main(String[] args) {

        ListaLigada<Integer> numeros = new A03_A04_ListaLigada_ou_ListaEncadeada.ListaLigada<>();

        numeros.adicionar(3);
        numeros.adicionar(4);
        numeros.adicionar(5);

        for(int i = 0; i < numeros.tamanho; i++) {
            System.out.println(numeros.buscar(i).valor);
        }

        numeros.remover(3);

        for(int i = 0; i < numeros.tamanho; i++) {
            System.out.println(numeros.buscar(i).valor);
        }
    }
}
