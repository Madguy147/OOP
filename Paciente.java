import java.util.Scanner;

class Paciente {
    String nome;
    String endereco;
    int cpf;
    String nivelDeEscolaridade;
    int dataDeNascimento;
    String email;
    int telefone;
    char sexo;


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




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Paciente paciente = new Paciente();


        System.out.println("Digite o nome: ");
        paciente.setNome(scanner.nextLine());

        System.out.println("Digite o endereço: ");
        paciente.setEndereco(scanner.nextLine());

        System.out.println("Digite a cpf: ");
        paciente.setCpf(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o Nível de escolaridade: ");
        paciente.setNiveldeEscolaridade(scanner.nextLine());

        System.out.println("Digite sua data de nascimento: ");
        paciente.setDataDeNascimento(scanner.nextInt());

        System.out.println("Digite o email: ");
        paciente.setEmail(scanner.nextLine());

        System.out.println("Digite a telefone:");
        paciente.setTelefone(scanner.nextInt());

        System.out.println("Digite seu sexo:");
        paciente.setSexo(scanner.next().charAt(0));


        System.out.println("-- Dados do animal --");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Endereço: " + paciente.getEndereco());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Nível de escolaridade: " + paciente.getNivelDeEscolaridade());
        System.out.println("Data de nascimento: " + paciente.getDataDeNascimento());
        System.out.println("Email: " + paciente.getEmail());
        System.out.println("Telefone: " + paciente.getTelefone());
        System.out.println("Sexo: " + paciente.getSexo());

        scanner.close();
    }
}