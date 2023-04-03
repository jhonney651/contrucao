package com.mycompany.construcao;

/**
 *
 * @author olive
 */
public class Concreto {
    private double base;
    private double comprimento;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
        
    public double calcularVolume(){
        return base * altura * comprimento;
  
    }

}