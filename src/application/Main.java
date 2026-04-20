package application;

import entities.Cliente;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", "pedrohenrqdev@gmail.com", 20);
        Cliente cliente2 = new Cliente("Alan", "pedro597381@gmail.com", 38);
        Produto produto1 = new Produto("1KG Feijão", 10.50, 5);
        Produto produto2 = new Produto("Morango", 9.0, 3);
        Pedido pedido1 = new Pedido(LocalDate.now(), StatusPedido.PROCESSANDO, cliente1);
        Pedido pedido2 = new Pedido(LocalDate.now(), StatusPedido.PROCESSANDO, cliente2);

        pedido1.adicionarProduto(produto1);
        pedido2.adicionarProduto(produto2);

        System.out.println(pedido1);
        System.out.println(pedido2);
    }
}
