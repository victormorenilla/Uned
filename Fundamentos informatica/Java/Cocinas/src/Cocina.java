import java.util.ArrayList;
import java.util.List;

public class Cocina {

    private List<estructura_alta> estructuras_altas=new ArrayList<>();
    private List<estructura_baja> estructuras_bajas=new ArrayList<>();
    private int long_pared;  ///cm
    private String nombre;

    public Cocina(String nombre){
        this.nombre=nombre;
    }

    public Cocina(String nombre,estructura_alta estAlt){
        estructuras_altas.add(estAlt);
        this.nombre=nombre;
    }

    public Cocina(String nombre,estructura_baja estBaj){
        estructuras_bajas.add(estBaj);
        this.nombre=nombre;
    }

    public Cocina(String nombre,estructura_alta estAlt, int long_pared){
        estructuras_altas.add(estAlt);
        this.long_pared=long_pared;
        this.nombre=nombre;
    }

    public Cocina(String nombre,estructura_baja estBaj, int long_pared){
        estructuras_bajas.add(estBaj);
        this.long_pared=long_pared;
        this.nombre=nombre;
    }

    public Cocina(String nombre,estructura_alta estAlt, estructura_baja estBaj, int long_pared){
        estructuras_altas.add(estAlt);
        estructuras_bajas.add(estBaj);
        this.long_pared=long_pared;
        this.nombre=nombre;
    }

    public List<estructura_alta> getEstructuras_altas() {
        return estructuras_altas;
    }

    public void setEstructuras_altas(List<estructura_alta> estructuras_altas) {
        this.estructuras_altas = estructuras_altas;
    }

    public List<estructura_baja> getEstructuras_bajas() {
        return estructuras_bajas;
    }

    public void setEstructuras_bajas(List<estructura_baja> estructuras_bajas) {
        this.estructuras_bajas = estructuras_bajas;
    }

    public void anyadirEstructura_Alta( estructura_alta est ){
        estructuras_altas.add(est);
    }

    public void anyadirEstructura_Baja( estructura_baja est ){
        estructuras_bajas.add(est);
    }

    public int getLong_pared() {
        return long_pared;
    }

    public void setLong_pared(int long_pared) {
        this.long_pared = long_pared;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "estructuras_altas=" + estructuras_altas.size() +
                ", estructuras_bajas=" + estructuras_bajas.size() +
                ", long_pared=" + long_pared +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
