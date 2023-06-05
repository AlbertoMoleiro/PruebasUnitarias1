package ejercicio1.model;

public class Rectangulo extends Figura{

    protected  double ancho;
    protected  double alto;
    public Rectangulo(int coordenadaX, int coordenadaY,double ancho,double alto) {
        super(coordenadaX, coordenadaY);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public int[] getPosition() {
        return super.getPosition();
    }

}
