import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(10); // Tamanho da tabela hash


//----------------------------------------------------------------------------------------------------------------------------------------------
        // TESTE PRÉ-DEFINIDO
        // CADASTRO DE USUÁRIOS
        tabelaHash.cadastrar_Usuario("Rênio Pereira", "85 9 9731-8935", "077.976.863-94", "renioqueiroz@gmail.com");
        tabelaHash.cadastrar_Usuario("Maria Rodrigues", "88 9 8765-0000", "723.072.773-15", "m.rod@outlook.com");
        tabelaHash.cadastrar_Usuario("Impostor miserável", "85 9 9999-9999", "077.976.863-94", "emailfalso@gmail.com");
        tabelaHash.cadastrar_Usuario("Pedro Paulo", "85 9 8456-9123", "010.235.410-60", "pedro_p@gmail.com");

        // PESQUISA POR CPF 
        String cpf_Pesquisa = "723.072.773-15";
        Usuario usuario_Encontrado = tabelaHash.pesquisar_Usuario(cpf_Pesquisa);

//---------------------------------------------------------------------------------------------------------------------------------------------
        //TESTE CASO DESEJE QUE O ALGORITIMO SOLICITE UMA ENTRADA
        //Scanner scanner = new Scanner(System.in);
        
        // CADASTRO DE MULTIPLOS USUÁRIOS
        //System.out.println("Digite o número de usuários que deseja cadastrar:");
        //int num_Usuarios = scanner.nextInt();
        //scanner.nextLine(); // Limpar o buffer
        
        //CICLO DE CADASTRO DE USUÁRIO
        //for (int i = 0; i < num_Usuarios; i++) {
        //    System.out.println("Cadastro do usuário " + (i + 1));
        //    System.out.print("Nome: ");
        //    String nome = scanner.nextLine();
        //    System.out.print("Telefone: ");
        //    String telefone = scanner.nextLine();
        //    System.out.print("CPF: ");
        //    String cpf = scanner.nextLine();
        //    System.out.print("email: ");
        //    String email = scanner.nextLine();

        //    tabelaHash.cadastrar_Usuario(nome, telefone, cpf, email);
        //    System.out.println("Usuário cadastrado com sucesso!\n");
        //}

        //PESQUISA CPF COM ENTRADA
        //System.out.println("Digite o CPF do usuário que deseja pesquisar:");
        //String cpf_Pesquisa = scanner.nextLine();
        //Usuario usuario_Encontrado = tabelaHash.pesquisar_Usuario(cpf_Pesquisa);

//--------------------------------------------------------------------------------------------------------------------------------------------------
        if (usuario_Encontrado != null) {
            System.out.println("Usuário encontrado:");
            System.out.println("Nome: " + usuario_Encontrado.nome);
            System.out.println("Telefone: " + usuario_Encontrado.telefone);
            System.out.println("CPF: " + usuario_Encontrado.cpf);
            System.out.println("Email: " + usuario_Encontrado.email);
        } else {
            System.out.println("Usuário não encontrado para o CPF: " + cpf_Pesquisa);
        }

    }
}