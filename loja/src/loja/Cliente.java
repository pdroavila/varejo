package loja;

public class Cliente {
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String senha;
	
	public Cliente(String nome, String endereco, String telefone, String email, String senha) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
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
    public String getDados() {
    	return "O nome completo é:"+this.nome+"\nEndereco:"+this.endereco+"\nTelefone:"+this.telefone+"\nEmail:"+this.email+"\nSenha:"+this.senha;
    }
    
}
