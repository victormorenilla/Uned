public class estructura_alta {
    private int alto=2,ancho=60;
    private boolean nevera=false;

    public estructura_alta(boolean nevera){
        this.nevera=nevera;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public boolean isNevera() {
        return nevera;
    }

    public void setNevera(boolean nevera) {
        this.nevera = nevera;
    }
}
