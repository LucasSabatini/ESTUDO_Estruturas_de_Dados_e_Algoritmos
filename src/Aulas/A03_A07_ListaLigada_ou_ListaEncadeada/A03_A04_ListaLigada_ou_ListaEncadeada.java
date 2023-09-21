package Aulas.A03_A07_ListaLigada_ou_ListaEncadeada;

public class A03_A04_ListaLigada_ou_ListaEncadeada {

    public static void main(String[] args) {

        ListaLigada<String> lista = new ListaLigada<>();
        System.out.println(lista.tamanho);
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");

        System.out.println("Tamanho: " + lista.tamanho);
        System.out.println("Primeiro: " + lista.primeiro.valor);
        System.out.println("Último: " + lista.ultimo.valor);

        for(int i = 0; i < lista.tamanho; i++) {
            System.out.println(lista.buscar(i).valor);
        }

        lista.remover("df");
        lista.remover("ac");
        lista.remover("ce");
        lista.remover("ba");
        System.out.println("Removeu df");
        lista.adicionar("SP");
        System.out.println("Tamanho: " + lista.tamanho);

        for(int i = 0; i < lista.tamanho; i++) {
            System.out.println(lista.buscar(i).valor);
        }

    }

    public static class Node<T> {
        public T valor;
        public Node<T> proximo;

        public Node(T valor) {
            this.valor = valor;
        }
    }

    public static class ListaLigada<T> {
        public Node<T> primeiro;
        public Node<T> ultimo;
        int tamanho;

        public ListaLigada() {
            this.tamanho = 0;
        }

        void adicionar(T novoValor) {
            Node<T> newNode = new Node<>(novoValor);
            if(this.primeiro == null && this.ultimo == null) {
                this.primeiro = newNode;
                this.ultimo = newNode;
            } else {
                this.ultimo.proximo = newNode;
                this.ultimo = newNode;
            }
            this.tamanho++;
        }

        public void remover(T valorProcurado) {
            Node<T> anterior = null;
            Node<T> atual = this.primeiro;
            for(int i = 0; i < this.tamanho; i++) {
                if(atual.valor.toString().equalsIgnoreCase(valorProcurado.toString())) {
                    if(tamanho == 1) {
                        this.primeiro = null;
                        this.ultimo = null;
                    } else if(atual == primeiro) {
                        this.primeiro = atual.proximo;
                        atual.proximo = null;
                    } else if(atual == ultimo) {
                        this.ultimo = anterior;
                        anterior.proximo = null;
                    } else {
                        anterior.proximo = atual.proximo;
                        atual = null;
                    }
                    this.tamanho--;
                    break;
                }
                anterior = atual;
                atual = atual.proximo;
            }
        }

        public Node<T> buscar(int posicao) {
            Node<T> atual = this.primeiro;
            for(int i = 0; i < posicao; i++) {
                if(atual.proximo != null) {
                    atual = atual.proximo;
                }
            }
            return atual;
        }

        public A07_Iterator_ListLigada<T> getIterator() {
            return new A07_Iterator_ListLigada<T>(this.primeiro);
        }

    }

}
