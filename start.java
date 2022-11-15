public class start {

    public static void main(String[] args) {
        Gruss g1 = new Gruss();
        Gruss g2 = new Gruss("Hans");

        Rechteck r1 = new Rechteck(3, 12);
        Rechteck quadrat = r1.toQuadratFlaeche();
        
        System.out.println(r1);
        System.out.println(quadrat);
        
    }

}