package ejercicio1.model;

public class Figura {
    protected int coordenadaX;
    protected int coordenadaY;

    public Figura(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public int[] getPosition() {
        int[] pos = new int[2];
        pos[0] = this.coordenadaX;
        pos[1] = this.coordenadaY;
        return pos;
    }
}
