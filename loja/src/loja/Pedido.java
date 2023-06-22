package loja;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private ArrayList<Produto> produtos;
    private Date data;
    private String status;
    private Cliente cliente;

    public Pedido(int numeroPedido, ArrayList<Produto> produtos, Date data, String status, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.produtos = produtos;
        this.data = data;
        this.status = status;
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void exibirDetalhes() {
        System.out.println("Número do pedido: " + this.numeroPedido);
        System.out.println("Data do pedido: " + this.data);
        System.out.println("Produtos:");
        for (Produto p : this.produtos) {
            p.exibirDetalhes();
        }
        System.out.println("Status do pedido: " + this.status);
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
}
