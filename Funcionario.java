import java.util.Scanner;

class Funcionario {
    String nome;
    String endereco;
    int cpf;
    String nivelDeEscolaridade;
    int dataDeNascimento;
    String email;
    int telefone;
    char sexo;
    int dataDeAdimissao;
    int dataDeDemissao;
    String cargo;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNivelDeEscolaridade() {
        return nivelDeEscolaridade;
    }
    public void setNiveldeEscolaridade(String nivelDeEscolaridade) {
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(int dataDeNascimento) {
        this.cpf = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getDataDeAdimissao() {
        return dataDeAdimissao;
    }
    public void setDataDeAdimissao(int dataDeAdimissao) {
        this.dataDeAdimissao = dataDeAdimissao;
    }

    public int getDataDeDemissao() {
        return dataDeDemissao;
    }
    public void setDataDeDemissao(int dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Funcionario funcionario = new Funcionario();


        System.out.println("Digite o nome: ");
        funcionario.setNome(scanner.nextLine());

        System.out.println("Digite o endereço: ");
        funcionario.setEndereco(scanner.nextLine());

        System.out.println("Digite a cpf: ");
        funcionario.setCpf(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o Nível de escolaridade: ");
        funcionario.setNiveldeEscolaridade(scanner.nextLine());

        System.out.println("Digite sua data de nascimento: ");
        funcionario.setDataDeNascimento(scanner.nextInt());

        System.out.println("Digite o email: ");
        funcionario.setEmail(scanner.nextLine());
        scanner.nextLine();

        System.out.println("Digite a telefone: ");
        funcionario.setTelefone(scanner.nextInt());

        System.out.println("Digite seu sexo: ");
        funcionario.setSexo(scanner.next().charAt(0));

        System.out.println("Digite sua data de adimissão: ");
        funcionario.setDataDeAdimissao(scanner.nextInt());

        System.out.println("Digite sua data de demissão: ");
        funcionario.setDataDeDemissao(scanner.nextInt());

        System.out.println("Digite seu cargo: ");
        funcionario.setCargo(scanner.nextLine());

        System.out.println("-- Dados do animal --");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Nível de escolaridade: " + funcionario.getNivelDeEscolaridade());
        System.out.println("Data de nascimento: " + funcionario.getDataDeNascimento());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Telefone: " + funcionario.getTelefone());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.println("Data de adimissão: " + funcionario.getDataDeAdimissao());
        System.out.println("Data de demissão: " + funcionario.getDataDeDemissao());
        System.out.println("Cargo: " + funcionario.getCargo());

        scanner.close();
    }
}