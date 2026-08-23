public class estructura_baja {
    private int alto=1,ancho=120;
    private boolean horno,fuegos;
    public estructura_baja(){}

    public estructura_baja(boolean horno,boolean fuegos){
        this.horno=horno;
        this.fuegos=fuegos;
    }

    public estructura_baja(boolean b) {
        this.horno=b;
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

    public boolean isHorno() {
        return horno;
    }

    public void setHorno(boolean horno) {
        this.horno = horno;
    }

    public boolean isFuegos() {
        return fuegos;
    }

    public void setFuegos(boolean fuegos) {
        this.fuegos = fuegos;
    }
}
