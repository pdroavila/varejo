package loja;

public class Vendedor {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private String cpf;
    
    public Vendedor(String nome, String endereco, String telefone, String email, String senha, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }
    
    // Getters e Setters
    public String getNomeCompleto() {
        return this.nome;
    }
    public void setNomeCompleto(String nome) {
        this.nome = nome;
    }
    public String getEnderecoCompleto() {
        return this.endereco;
    }
    public void setEnderecoCompleto(String endereco) {
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
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}