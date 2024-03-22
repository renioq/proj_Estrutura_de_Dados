class Usuario {
    String nome;
    String telefone;
    String cpf;
    String email;
    Usuario proximo; 

    public Usuario(String nome, String telefone, String cpf, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.proximo = null;
    }
}