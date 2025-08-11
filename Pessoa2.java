import java.util.Scanner;

class Pessoa2 {
    String nome;
    int idade;
    String endereco;
    String profissao;

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter e Setter para endereço
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter e Setter para profissão
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Classe com o método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Solicitando e recebendo os dados do usuário
        System.out.println("Digite o nome:");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite a idade:");
        pessoa.setIdade(scanner.nextInt());
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o endereço:");
        pessoa.setEndereco(scanner.nextLine());

        System.out.println("Digite a profissão:");
        pessoa.setProfissao(scanner.nextLine());

        // Apresentando os dados do objeto
        System.out.println("-- Dados da Pessoa --");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Profissão: " + pessoa.getProfissao());

        scanner.close();
    }
}