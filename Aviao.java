import java.util.Scanner;

class Aviao {
    String tipo;
    String cor;
    double velocidade;
    int qtdeAssentos;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getQtdeAssentos() { 
        return qtdeAssentos;
    }

    public void setQtdeAssentos(int qtdeAssentos) {
        this.qtdeAssentos = qtdeAssentos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aviao aviao1 = new Aviao();
        Aviao aviao2 = new Aviao();
        Aviao aviao3 = new Aviao();

        //OBJETO 1//
        System.out.println("Digite o tipo: ");
        aviao2.setTipo(scanner.nextLine());

        System.out.println("Digite a cor: ");
        aviao2.setCor(scanner.nextLine());

        System.out.println("Digite a velocidade: ");
        aviao2.setVelocidade(scanner.nextDouble());

        System.out.println("Digite a quantidade de assentos: ");
        aviao2.setQtdeAssentos(scanner.nextInt());

        //OBJETO 2//
        System.out.println("Digite o tipo: ");
        aviao1.setTipo(scanner.nextLine());
        scanner.nextLine();

        System.out.println("Digite a cor: ");
        aviao1.setCor(scanner.nextLine());

        System.out.println("Digite a velocidade: ");
        aviao1.setVelocidade(scanner.nextDouble());

        System.out.println("Digite a quantidade de assentos: ");
        aviao1.setQtdeAssentos(scanner.nextInt());

        //OBJETO 3//
        System.out.println("Digite o tipo: ");
        aviao3.setTipo(scanner.nextLine());
        scanner.nextLine();

        System.out.println("Digite a cor: ");
        aviao3.setCor(scanner.nextLine());

        System.out.println("Digite a velocidade: ");
        aviao3.setVelocidade(scanner.nextDouble());

        System.out.println("Digite a quantidade de assentos: ");
        aviao3.setQtdeAssentos(scanner.nextInt());


        //OBJETO 1//
        System.out.println("-- Dados do avião 1 --");
        System.out.println("Tipo: " + aviao1.getTipo());
        System.out.println("Cor: " + aviao1.getCor());
        System.out.println("Velocidade: " + aviao1.getVelocidade());
        System.out.println("Quantidade de assentos: " + aviao1.getQtdeAssentos());

         //OBJETO 2//
        System.out.println("-- Dados do avião 2 --");
        System.out.println("Tipo: " + aviao2.getTipo());
        System.out.println("Cor: " + aviao2.getCor());
        System.out.println("Velocidade: " + aviao2.getVelocidade());
        System.out.println("Quantidade de assentos: " + aviao2.getQtdeAssentos());

         //OBJETO 3//
        System.out.println("-- Dados do avião 3 --");
        System.out.println("Tipo: " + aviao3.getTipo());
        System.out.println("Cor: " + aviao3.getCor());
        System.out.println("Velocidade: " + aviao3.getVelocidade());
        System.out.println("Quantidade de assentos: " + aviao3.getQtdeAssentos());

        scanner.close();
    }
}