package Aulas.A11_A13_Ordenacao_de_Vetores;

import java.util.Arrays;

public class A13_SelectionSort {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Desordenado: " + Arrays.toString(vetor));

        //Selection Sort -> Complexidade O(n^2) -> quadrática
        int posicao_menor, aux;
        for(int i = 0; i < vetor.length; i++) { //O(n)
            posicao_menor = i;
            for(int j = i + 1; j < vetor.length; j++) { //O(n)
                if(vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }

        System.out.println("Ordenado: " + Arrays.toString(vetor));

    }
}
