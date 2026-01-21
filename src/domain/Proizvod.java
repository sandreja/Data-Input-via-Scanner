package domain;

public class Proizvod {
    private float cena;
    private String ime;

    public Proizvod(String ime, float cena) {
        this.ime = ime;
        this.cena = cena;
    }

    public String getIme() {
        return ime;
    }

    public float getCena() {
        return cena;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setCena(float cena) {
        this.cena = cena;
    }


}
