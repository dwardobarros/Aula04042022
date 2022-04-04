public class Numero {

    /*
     * Faça um algoritmo que receba vários números até que o usuário digite o número
     * 1000, calcule e mostre:
     * •A soma dos números digitados
     * •A quantidade de números digitados
     * •A média dos números digitados
     * •O maior número digitado
     * •O menor número digitado
     */

    private int numero, i, soma = 0, maiorNumero = 0, menorNumero;

    public int getSoma() { //só o get para mostrar o resultado no main
        return this.soma;
    }

    public int getMaiorNumero() { //só o get para mostrar o resultado no main
        return this.maiorNumero;
    }

    public int getMenorNumero() { //precisa de getter e setter porque necessita do input do usuario na Main
        return this.menorNumero;
    }

    public void setMenorNumero(int menorNumero) {
        this.menorNumero = menorNumero;
    }

    public int getI() { //Contador precisa de get e set para ser utilizado com ++ no main.
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int somar() {
        return this.soma = this.soma + this.numero; // não precisa de get, tá na mesma classe, cabaço...
    }

    public double calcularMedia() {
        return (somar() - 1000) / i;
    }

    public void selecionarMaior() {
        if (this.numero > this.maiorNumero) {
            this.maiorNumero = this.numero;
        }
    }

    public void selecionarMenor() {
        if (this.numero < this.menorNumero) {
            this.menorNumero = this.numero;
        }
    }
}
