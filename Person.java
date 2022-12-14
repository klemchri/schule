public class Person {
    private String vorname;
    private String nachname;
    private int alter; 

    public Person(String vorname, String nachname, int alter) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAlter(alter);
    }
    
    public Person(String vorname, String nachname) {
        this(vorname, nachname, 0);
    }

    public Person(String vorname) {
        this(vorname, "Mustermann", 0);
    }

    public Person () {
        this("Max", "Mustermann", 0);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        if (alter < 0) {
            System.out.println("Alter darf nicht negativ sein!");
        }else{
            this.alter = alter;
        }
    }

    public void print() {
        System.out.println("Person: " + vorname + " " + nachname + " ist " + alter + " Jahr" + (alter==1?"":"e") + " alt.");
    }
}
