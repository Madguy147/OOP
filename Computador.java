import java.util.Scanner;

public class Computador {

    private String monitor;
    private String gabinete;
    private String teclado;
    private String mouse;

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Computador computador = new Computador();

        System.out.println("Digite o modelo do monitor: ");
        computador.setMonitor(scanner.nextLine());

        System.out.println("Digite o modelo do gabinete: ");
        computador.setGabinete(scanner.nextLine());

        System.out.println("Digite o modelo do teclado: ");
        computador.setTeclado(scanner.nextLine());

        System.out.println("Digite o modelo do mouse: ");
        computador.setMouse(scanner.nextLine());

        System.out.println("\n-- Dados do Computador --");
        System.out.println("Monitor: " + computador.getMonitor());
        System.out.println("Gabinete: " + computador.getGabinete());
        System.out.println("Teclado: " + computador.getTeclado());
        System.out.println("Mouse: " + computador.getMouse());

        scanner.close();
    }
}