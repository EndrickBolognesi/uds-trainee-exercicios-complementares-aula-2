package Exercicio_2;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Produto> produtos;
    private Double total;

    public Pedido() {
        produtos = new ArrayList<>();
        total = 0.0;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
        calculaTotal(produto);
    }

    public void calculaTotal(Produto item) {
        total += item.getValor();
    }

    public Double getTotal() {
        return total;
    }
}
