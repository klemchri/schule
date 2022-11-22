public class start {

    public static void main(String[] args) {
        Gruss g1 = new Gruss();
        Gruss g2 = new Gruss("Hans");

        System.out.println("Schulrechecke:");
        
        Rechteck schule1 = new Rechteck();
        Rechteck schule2 = new Rechteck(100);
        System.out.println(schule1);
        System.out.println(schule2);


        System.out.println("Eigene Versuche:");
        Rechteck r1 = new Rechteck(3, 12);
        Rechteck quadrat = r1.toQuadratFlaeche();
        
        System.out.println(r1);
        System.out.println(quadrat);

        r1.tell_me_more();
        
    }

}