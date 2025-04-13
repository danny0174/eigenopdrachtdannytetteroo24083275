package org.example;

public class Persoon implements EetSchema {
    private String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public boolean eetMee(String dag) {
        return false;
    }
}
