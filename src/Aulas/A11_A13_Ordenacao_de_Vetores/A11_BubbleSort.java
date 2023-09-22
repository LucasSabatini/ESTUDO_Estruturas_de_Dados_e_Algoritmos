package Aulas.A11_A13_Ordenacao_de_Vetores;

public class A11_BubbleSort {
    public static void main(String[] args) {
        int[] vetor = new int[10000];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        //System.out.println(Arrays.toString(vetor));

        int temp;

        long inicio = System.currentTimeMillis();
        //Bubble Sort -> O(n^2) -> quadrática
        for(int i = 0; i < vetor.length; i++) { //Complexidade de O(n)
            for(int j = i + 1; j < vetor.length; j++) { //Complexidade de O(n)
                if(vetor[i] > vetor[j]) {
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));
    }
}
