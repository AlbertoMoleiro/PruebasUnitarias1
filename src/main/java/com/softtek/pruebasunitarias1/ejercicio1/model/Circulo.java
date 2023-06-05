package com.softtek.pruebasunitarias1.ejercicio1.model;

public class Circulo extends Figura{
    protected double radio;
    public Circulo(int x, int y, double radio) {
        super(x,y);
        this.radio=radio;
    }

    @Override
    public int[] getPosition() {
        return super.getPosition();
    }

    //Método para calcular el area
    public double getArea() {
    	return Math.PI*Math.pow(radio, 2);
    }
}
