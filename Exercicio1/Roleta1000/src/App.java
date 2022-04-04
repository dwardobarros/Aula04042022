import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero n = new Numero();

        n.setNumero(ler.nextInt());
        n.setMenorNumero(n.getNumero());

        do {

            n.somar();
            n.selecionarMaior();
            n.selecionarMenor();
            n.setI(n.getI() + 1); // Contador I seta o valor atual + 1
            System.out.println("Informe o próximo número:");
            n.setNumero(ler.nextInt());

        } while (n.getNumero() != 1000);

        System.out.println("Média dos números informados:" + n.calcularMedia());
        System.out.println("Maior número: " + n.getMaiorNumero());
        System.out.println("Menor número: " + n.getMenorNumero());
        System.out.println("Soma dos números: " + (n.getSoma() - 1000));
    }
}
