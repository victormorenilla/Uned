import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        Inicio();
        sc.close();
        sc1.close();
        System.out.println("Adios....");
    }
    private static Scanner sc = new Scanner(System.in);
    private static Scanner sc1 = new Scanner(System.in);
    private static int num=0;
    private static int num2=0;
    private static String palabras;
    private static List<Cocina> Cocinas=new ArrayList<>();
    private static Cocina coc1;
    private static estructura_alta estAlt;
    private static estructura_baja estBaj;


    public static void Inicio() {

        do {
            System.out.println("1:Anyada una cocina!");
            System.out.println("0:Salir");
            System.out.println();
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("1:Nombre de la cocina?");
                    palabras = sc1.next();
                    coc1=new Cocina(palabras);
                    Cocinas.add(coc1);
                    estAlt=new estructura_alta(false);
                    estBaj=new estructura_baja(false,false);
                    do{
                        System.out.println();
                        System.out.println("1:Anyada una estructura alta!");
                        System.out.println("2:Anyada una estructura baja!");
                        System.out.println("3:Tiene nevera");
                        System.out.println("4:Tiene horno");
                        System.out.println("5:Tiene fuegos");
                        System.out.println("6: Ver todas las cocinas");
                        System.out.println("0:Salir");
                        System.out.println();
                        num2=sc1.nextInt();
                        switch (num2) {
                            case 1:
                                System.out.println("Tiene nevera (si/no)");
                                String tiene_nevera = sc1.next();
                                if (tiene_nevera.equalsIgnoreCase("si")) estAlt = new estructura_alta(true);
                                else estAlt = new estructura_alta(false);
                                coc1.anyadirEstructura_Alta(estAlt);
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("Tiene horno(si/no)");
                                String tiene_horno = sc1.next();

                                String tiene_fuegos = "";
                                if (Objects.equals(tiene_horno, "si")) {
                                    System.out.println("Tiene fuegos(si/no)");
                                    tiene_fuegos = sc1.next();
                                    if (Objects.equals(tiene_fuegos, "si")) estBaj = new estructura_baja(true, true);
                                    else {
                                        estBaj = new estructura_baja(true, false);
                                    }
                                } else {
                                    estBaj = new estructura_baja(false);
                                    String tiene_fuegos2 = tiene_fuegos;
                                    if (tiene_fuegos2 .equalsIgnoreCase( "si")) estBaj = new estructura_baja(false, true);
                                    else {
                                        estBaj = new estructura_baja(false, false);
                                    }
                                }
                                coc1.anyadirEstructura_Baja(estBaj);
                                System.out.println();
                                break;
                            case 3:
                                if (coc1.getEstructuras_altas().size() > 0) {
                                    for (int i = 0;
                                         i < coc1.getEstructuras_altas().size(); i++) {
                                        if (coc1.getEstructuras_altas().get(i).isNevera())
                                            System.out.println("Estructura alta n: " + i + 1 + ". Tiene nevera.");
                                        else
                                            System.out.println("Estructura alta n: " + i + 1 + ". No tiene nevera.");
                                    }
                                }
                                System.out.println();
                                break;
                            case 4:
                                if (coc1.getEstructuras_bajas().size() > 0) {
                                    for (int i = 0;
                                         i < coc1.getEstructuras_bajas().size(); i++) {
                                        if (coc1.getEstructuras_bajas().get(i).isHorno())
                                            System.out.println("Estructura baja nº: " + i + 1 + ". Tiene horno.");
                                        else
                                            System.out.println("Estructura baja nº: " + i + 1 + ". No tiene horno.");
                                    }
                                } else
                                    System.out.println("Esta cocina " + coc1.getNombre() + " no tiene estructuras bajas");
                                System.out.println();
                                break;
                            case 5:
                                if (coc1.getEstructuras_bajas().size() > 0) {
                                    for (int i = 0;
                                         i < coc1.getEstructuras_bajas().size(); i++) {
                                        if (coc1.getEstructuras_bajas().get(i).isFuegos())
                                            System.out.println("Estructura baja nº: " + i + 1 + ". Tiene fuegos.");
                                        else
                                            System.out.println("Estructura baja nº: " + i + 1 + ". No tiene fuegos.");
                                    }
                                } else
                                    System.out.println("Esta cocina " + coc1.getNombre() + " no tiene estructuras bajas");
                                System.out.println();
                                break;
                            case 6:
                                if (Cocinas.size() > 0)
                                    for (int i = 0; i < Cocinas.size(); i++) {
                                        System.out.println(Cocinas.get(i).toString());
                                    }
                                else
                                    System.out.println("No hay cocinas..");
                                System.out.println();
                                break;
                            case 0:
                                num2 = 0;
                                break;
                            default:
                                System.out.println("Numeros del 0 al 6");
                                break;
                        }
                    }while(num2!=0);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Números del 1 al 0 ");
                    break;
            }

        } while (num != 0);
    }
}

