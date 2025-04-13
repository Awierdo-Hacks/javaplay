package oefz1;

public class KotStudent extends Student {

    private String kotadress;

    public KotStudent(String naam, String gebdat, String adres, double punten, String klas, String kotadress) {
        super(naam, gebdat, adres, punten, klas);
        this.kotadress = kotadress;
    }

    public KotStudent(String kotadress) {
        super();
        this.kotadress = kotadress;
    }

    public String getKotadress() {
        return kotadress;
    }

    public void setKotadress(String kotadress) {
        this.kotadress = kotadress;
    }

    @Override
    public String toString() {
        return super.toString() + "kotadress='" + kotadress + '\'' + '}';
    }
}
