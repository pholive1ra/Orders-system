package entities;

import entities.enums.StatusPedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private StatusPedido statusPedido;
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(LocalDate data, StatusPedido statusPedido, Cliente cliente) {
        this.data = data;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public Double total() {
        Double soma = 0.0;
        for (Produto p : produtos) {
            soma += p.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("DADOS DO PEDIDO:\n");
        sb.append(cliente).append("\n");
        sb.append("Status: ").append(statusPedido).append("\n");

        for (Produto p : produtos) {
            sb.append(p).append("\n");
        }

        sb.append("Total: R$").append(total());

        return sb.toString();
    }
}

