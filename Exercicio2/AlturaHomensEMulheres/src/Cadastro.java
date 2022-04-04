import java.util.Scanner;

/**
 * 
 * Tem-se um conjunto de dados contendo a altura e o sexo (masculino=1 ou
 * feminino=2) de 15 pessoas.
 * Faça um algoritmo que calcule e mostre:
 * 
 * •A maior e a menor altura do grupo
 * •A média de altura das mulheres
 * •O número de homens
 * •O sexo da pessoa mais alta
 */

public class Cadastro {
    
    private double altura, maiorAltura = 0, menorAltura, somaAlturaMulheres = 0;
    private int sexo, qntHomens, qntMulheres;
    private String sexoMaiorAltura;
    
    public double somarAlturaMulheres() {
    
        return this.somaAlturaMulheres = this.somaAlturaMulheres + this.altura;
    }
    
    public double calcularMediaAlturaMulheres() {
    
    return this.somarAlturaMulheres() / this.qntMulheres;
    
    }
    
    public void verificarMaiorAltura() {
    
        if (this.altura > this.maiorAltura && (this.sexo == 1 || this.altura == 2)) {
            this.maiorAltura = this.altura;
            if (this.sexo == 1) {
                this.sexoMaiorAltura = "Masculino";
            } else {
                this.sexoMaiorAltura = "Feminino";
            }
        }
    
    }

    public void verificarMenorAltura() {

        if (this.altura < this.menorAltura && (this.sexo == 1 || this.altura == 2)) {
            this.menorAltura = this.altura;
        } else {
            
        }

    }

    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getMaiorAltura() {
        return this.maiorAltura;
    }

    public void setMaiorAltura(double maiorAltura) {
        this.maiorAltura = maiorAltura;
    }

    public double getMenorAltura() {
        return this.menorAltura;
    }

    public void setMenorAltura(double menorAltura) {
        this.menorAltura = menorAltura;
    }

    public double getSomaAlturaMulheres() {
        return this.somaAlturaMulheres;
    }

    public void setSomaAlturaMulheres(double somaAlturaMulheres) {
        this.somaAlturaMulheres = somaAlturaMulheres;
    }

    public int getSexo() {
        return this.sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getQntHomens() {
        return this.qntHomens;
    }

    public void setQntHomens(int qntHomens) {
        this.qntHomens = qntHomens;
    }

    public int getQntMulheres() {
        return this.qntMulheres;
    }

    public void setQntMulheres(int qntMulheres) {
        this.qntMulheres = qntMulheres;
    }


}