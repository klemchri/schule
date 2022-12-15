import java.lang.Math;

public class Rechteck {

    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(double laenge) {
        this(laenge, laenge);
    }

    public Rechteck() {
        this(100, 200);
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        if (laenge < 0) {
            this.laenge = laenge;
        }else{
            throw new IllegalArgumentException("Länge darf nicht negativ sein!");
        }
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        if (breite < 0) {
            this.breite = breite;
        }else{
            throw new IllegalArgumentException("Breite darf nicht negativ sein!");
        }

    }

    public double umfang() {
        return 2 * (laenge + breite);
    }

    public double flaeche() {
        return laenge * breite;
    }

    public double berechneFlaeche(double laenge, double breite) { return laenge * breite; }

    public double diagonalenlaenge() {
        return Math.sqrt(Math.pow(laenge, 2) + Math.pow(breite, 2));
    }

    public double diagonalenwinkel() {
        return Math.atan(breite / laenge);
    }

    @Override
    public String toString() {
        if (laenge == breite) {
            return "Quadrat mit Seitenlänge = " + laenge + ", Fläche = " + this.flaeche() + " und  Umfang = " + this.umfang();
        }
        return "Rechteck mit Länge = " + laenge + ", Breite = " + breite + ", Fläche = " + this.flaeche() + " und  Umfang = " + this.umfang();
    }

    public Rechteck toQuadratFlaeche() {
        double laenge = Math.sqrt(this.flaeche());
        return new Rechteck(laenge);
    }

    public void tell_me_more() {
        System.out.println("This is a Rechteck");
        
    }

}