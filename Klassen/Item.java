package Klassen;

public class Item {
    private String bezeichnung;
    private int     id;
    private double  preis;
    private int     menge;



    public Item(String pBezeichnung){
        this.bezeichnung = pBezeichnung;

    }
    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getId() {
        return id;
    }

    public double getPreis() {
        return preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }
}
