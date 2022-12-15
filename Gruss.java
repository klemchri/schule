public class Gruss {

    private String name;

    public Gruss(String name) {
        this.name = name;
        this.begruessen();
    }

    public Gruss(Person p) {
        this(p.getVorname() + " " + p.getNachname());
    }

    public Gruss() {
        this("ITFM1");
    }

    public void begruessen(){
        System.out.println("Hallo " + name + "!");
    }

    @Override
    public String toString() {
        return "Hallo " + name + "!";
    }

}


