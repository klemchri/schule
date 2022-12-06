public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        this.setZaehler(zaehler);
        this.setNenner(nenner);
    }
    
    public Bruch(int zaehler) {
        this.setZaehler(zaehler);
        this.nenner = 1;
    }

    public Bruch() {
        this.nenner = 1;
        this.zaehler = 0;
    }

    public void print()
    {
        System.out.println(this.getZaehler() + "/" + this.getNenner());
    }

    public void printDecimal(){
        String ausgabe = (double) zaehler / nenner + "";
        System.out.println(ausgabe);
    }


    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public void setNenner(int nenner) {
        if (nenner != 0){
            this.nenner = nenner;
        }
        else{
            throw new IllegalArgumentException("Nenner darf nicht 0 sein!");
        }
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }
    

    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }

    public String toDoubleString() {
        return (double) zaehler / nenner + "";
    }
}