import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cadastro c = new Cadastro();
        Scanner ler = new Scanner(System.in);

        
        for (int i = 0; i <= 14; i++) {

            if (i==0) { //verifica se é a primeira altura do input
                
                System.out.println("Informe a primeira altura: ");
                c.setAltura(ler.nextDouble());
                c.setMenorAltura(c.getAltura());

            }
            
        }
        
        c.verificarMaiorAltura();
        c.verificarMenorAltura();

        System.out.println("Informe o sexo 1-masc ou 2-fem");
        c.setSexo(ler.nextInt());

        if (c.getSexo() == 1) {
            c.setQntHomens(c.getQntHomens() + 1);
        } else if (c.getSexo() == 2) {
            c.somarAlturaMulheres();
            c.setQntMulheres(c.getQntMulheres() + 1);
        }
        

        c.somarAlturaMulheres();

    }
}
