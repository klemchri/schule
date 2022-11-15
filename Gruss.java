public class Gruss {

    private String name;

    public Gruss() {
        this.name = "ITFM1";
        this.begruessen();
    }

    public Gruss(String name) {
        this.name = name;
        this.begruessen();
    }

    public void begruessen(){
        System.out.println("Hallo " + name + "!");
    }

}


