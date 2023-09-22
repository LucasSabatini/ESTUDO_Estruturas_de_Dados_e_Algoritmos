package Aulas.A11_A13_Ordenacao_de_Vetores;

import java.util.Arrays;

public class A12_InsertionSort {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        //preenchimento com números aleatórios
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        System.out.println("Desordenado: " + Arrays.toString(vetor));

        //Insertion Sort -> Complexidade O(n^2) -> quadrática
        int aux, j;
        for(int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
            System.out.println("Ordenado: " + Arrays.toString(vetor));

    }
}
