package Exercicio_2;

public class main {
    public static void main(String[] args) {


        Pedido pedido = new Pedido();
        pedido.addProduto(new Produto("Headset",689.00));
        pedido.addProduto(new Produto("Cadeira Gamer",99999.99));
        pedido.addProduto(new Produto("Monitor 144hz",198888.00));
        pedido.addProduto(new Produto("Mouse Razer",8000.00));
        pedido.addProduto(new Produto("Gabinete RGB",123456.78));
        System.out.println(pedido.getTotal());


    }
}
