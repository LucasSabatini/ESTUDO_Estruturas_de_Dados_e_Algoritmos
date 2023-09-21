package Aulas.A03_A07_ListaLigada_ou_ListaEncadeada;

import Aulas.A03_A07_ListaLigada_ou_ListaEncadeada.A03_A04_ListaLigada_ou_ListaEncadeada.Node;

public class A07_Iterator_ListLigada<T> {

    private Node<T> node;

    public A07_Iterator_ListLigada(Node<T> atual) {
        this.node = atual;
    }

    public boolean temProximo() {
        return node.proximo != null;
    }

    public Node<T> getProximo() {
        node = node.proximo;
        return node;
    }
}
