public class start {

    public static void main(String[] args) {
        testPerson();
        // testFraction();  // Eigene Klasse aus der Uni
        // testBruch();     // Schul-Klasse mit Extra-Methoden
        // testRechteck();  // Schul-Klasse mit Extra-Methoden
        // testGruss();     // Schul-Klasse
    }

    public static void testPerson(){
        Person p1 = new Person("Hans", "Müller", 20);
        Person p2 = new Person("Hans", "Müller");
        Person p3 = new Person("Hans");
        Person p4 = new Person();
        
        p1.print();
        p2.print();
        p3.print();
        p4.print();

        Gruss g1 = new Gruss(p1);
    }

    public static void testFraction(){
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = new Fraction(2, 4);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.multiply(f2));
        System.out.println(f1.divideBy(f2));

        System.out.println(f3 + " " + f3.equals(f1));
    }

    public static void testBruch(){
        System.out.println("Bruch:");
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(3, 4);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.toDoubleString());
    }

    public static void testRechteck(){
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

    public static void testGruss(){
        Gruss g1 = new Gruss();
        Gruss g2 = new Gruss("Hans");
        System.out.println(g1);
        System.out.println(g2);
    }
}