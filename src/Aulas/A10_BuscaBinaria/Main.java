package Aulas.A10_BuscaBinaria;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[10000];
        Scanner sc = new Scanner(System.in);

        //Preenchimento ordenado do vetor
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        }

        System.out.println(Arrays.toString(vetor));
        System.out.println("Número a buscar: ");
        int buscado = sc.nextInt();

        int contador = 0;

        boolean achou = false;
        int inicio = 0;
        int meio;
        int fim = vetor.length - 1;

        //Complexidade da busca binária = O(log n) -> a melhor função possível
        while(inicio <= fim) {
            meio = (inicio + fim) / 2;
            contador++;
            if(vetor[meio] == buscado) {
                achou = true;
                break;
            } else if(vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Quantidade de testes: " + contador);
        if(achou) {
            System.out.println("Achou");
        } else {
            System.out.println("Não achou");
        }

    }
}
