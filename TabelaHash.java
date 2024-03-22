import java.util.HashMap;

class TabelaHash {
    
    private HashMap<Integer, Usuario> tabela;
    private int tamanho;
    
    public TabelaHash(int tamanho) {
        this.tabela = new HashMap<>();
        this.tamanho = tamanho;
        // INICIO COM LISTA VAZIA
        for (int i = 0; i < tamanho; i++) {
            tabela.put(i, null);
        }
    }

    // FUNÇÃO HASH PARA A DIFUSÃO DOS CPFs NOS ENDEREÇOS
    private int hash(String cpf) {
        return Math.abs(cpf.hashCode() % tamanho);
    }

    //FUNÇÃO CADASTRO DE USUÁRIO
    public void cadastrar_Usuario(String nome, String telefone, String cpf, String email) {
        
        if (pesquisar_Usuario(cpf) != null) {
            System.out.println("Usuário com CPF " + cpf + " já cadastrado.");
            return;
        }
        
        int indice = hash(cpf);

        Usuario novo_Usuario = new Usuario(nome, telefone, cpf, email);
        
        // ADIÇÃO DE USUÁRIO, CASO NÃO HAJA NADA NO ENDEREÇO
        if (tabela.get(indice) == null) {
            tabela.put(indice, novo_Usuario);
        } else {
            // TRATA A COLISÃO COM UMA LISTA ENCADEADA
            Usuario usuario_Atual = tabela.get(indice);
            while (usuario_Atual.proximo != null) {
                usuario_Atual = usuario_Atual.proximo;
            }
            usuario_Atual.proximo = novo_Usuario;
        }
    }

    //FUNÇÃO PARA PROCURAR USUÁRIOS COM BASE NO CPF
    public Usuario pesquisar_Usuario(String cpf) {
        int indice = hash(cpf);
        Usuario usuario_Atual = tabela.get(indice);

        // PESQUISA 1:1 CASO TENHA UMA LISTA NO ENDEREÇO
        while (usuario_Atual != null) {
            if (usuario_Atual.cpf.equals(cpf)) {
                return usuario_Atual;
            }
            usuario_Atual = usuario_Atual.proximo;
        }
        return null; // RETORNO NULL CASO NÃO ENCONTRE O USUÁRIO
    }

    public HashMap<Integer, Usuario> getTabela() {
        return tabela;
    }

    public void setTabela(HashMap<Integer, Usuario> tabela) {
        this.tabela = tabela;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}