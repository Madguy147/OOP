import java.util.Scanner;

class Cadeira {
    String encosto;
    String acento;
    String rodinha;
    String apoiodeBraco;

    public String getEncosto() {
        return encosto;
    }

    public void setEncosto(String encosto) {
        this.encosto = encosto;
    }

    public String getAcento() {
        return acento;
    }

    public void setAcento(String acento) {
        this.acento = acento;
    }

    public String getRodinha() {
        return rodinha;
    }

    public void setRodinha(String rodinha) {
        this.rodinha = rodinha;
    }

    public String getApoiodeBraco() {  
        return apoiodeBraco;
    }

    public void setApoiodeBraco(String apoiodeBraco) {
        this.apoiodeBraco = apoiodeBraco;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cadeira cadeira = new Cadeira();
       
        System.out.println("Digite o tipo de encosto: ");
        cadeira.setEncosto(scanner.nextLine());

        System.out.println("Digite o tipo de acento: ");
        cadeira.setAcento(scanner.nextLine());

        System.out.println("Digite o tipo de rodinha: ");
        cadeira.setRodinha(scanner.nextLine());

        System.out.println("Digite o tipo de apoio de braço: ");
        cadeira.setApoiodeBraco(scanner.nextLine());

        System.out.println("-- Dados da cadeira --");
        System.out.println("Encosto: " + cadeira.getEncosto());
        System.out.println("Acento: " + cadeira.getAcento());
        System.out.println("Rodinha: " + cadeira.getRodinha());
        System.out.println("Apoio de braço: " + cadeira.getApoiodeBraco());  

        scanner.close();
    }
}