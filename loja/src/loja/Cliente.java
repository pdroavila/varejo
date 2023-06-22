package loja;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String senha;
	private List<Pedido> pedidos;
	
	public Cliente(String nome, String endereco, String telefone, String email, String senha) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.pedidos = new ArrayList<>();
	}
	
	///Getters e Setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void adicionarPedido(Pedido pedido) {
    	pedidos.add(pedido);
    }
    public List<Pedido> getPedidos(){
    	return pedidos;
    }
    
    public String getDados() {
    	return "O nome completo é:"+this.nome+"\nEndereco:"+this.endereco+"\nTelefone:"+this.telefone+"\nEmail:"+this.email+"\nSenha:"+this.senha;
    }
    
}