package oefz1;

public class Persoon {
    private String naam;
    private String gebdat;
    private String adres;

    public Persoon(String naam, String gebdat, String adres) {
        if (!gebdat.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new IllegalArgumentException("Invalid date format. Use dd/mm/jjjj.");
        }
        this.naam = naam;
        this.gebdat = gebdat;
        this.adres = adres;
    }

    public Persoon() {
        this.naam = "";
        this.gebdat = "";
        this.adres = "";
    }

    public String getNaam() {
        return naam;
    }

    public String getGebdat() {
        return gebdat;
    }

    public String getAdres() {
        return adres;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setGebdat(String gebdat) {
        if (!gebdat.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new IllegalArgumentException("Invalid date format. Use dd/mm/jjjj.");
        }
        this.gebdat = gebdat;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Persoon{naam='" + naam + "', gebdat='" + gebdat + "', adres='" + adres + "'}";
    }
}
