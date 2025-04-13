package oefz1;
public class Student extends Persoon{
    private String klas;
    private double punten;

    public Student(String naam, String gebdat, String adres, double punten, String klas) {
        super(naam, gebdat, adres);
        this.punten = punten;
        this.klas = klas;
    }

    public Student() {
        super();
        this.punten = 0;
        this.klas = "";
    }

    public String getKlas() {
        return klas;
    }

    public double getPunten() {
        return punten;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }

    public void setPunten(double punten) {
        this.punten = punten;
    }

    @Override
    public String toString() {
        return super.toString() + "klas='" + klas + '\'' + ", punten=" + punten + '}';
    }
}
