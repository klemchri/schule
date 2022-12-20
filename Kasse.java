import java.util.Scanner;
public class Kasse {

    int anzPKW;
    int anzLKW;
    double einnahmen;
    
    public Kasse()
    {
        this.anzPKW = 0;
        this.anzLKW = 0;
    }

    public void print()
    {   
        System.out.println("Einnahmen: " + this.einnahmen);
        System.out.println("Anzahl PKW: " + this.getPKW());
        System.out.println("Anzahl LKW: " + this.getLKW());
        System.out.println("Gesamt: " + (this.anzPKW + this.anzLKW));
    }

    public void starteEingabe(){
        Scanner sc = new Scanner(System.in);
        String eingabe; 

        while(true){
            System.out.println("PKW, LKW oder ENDE?");
            eingabe = sc.nextLine();

            if (eingabe.equals("PKW")){
                this.setPKW(this.getPKW() + 1);
                System.out.println("Das kostet 1 Euro");
                this.einnahmen += 1.00;

            }
            else if (eingabe.equals("LKW")){
                this.setLKW(this.getLKW() + 1);
                System.out.println("Das kostet 2,50 Euro");
                this.einnahmen += 2.50;
            }
            else if (eingabe.equals("ENDE")){
                System.out.println(this);
                System.out.println("Programm wird beendet!");
                break;
            }
            else{
                System.out.println("Falsche Eingabe!");
            }
        }
        sc.close();
    }

    public int getLKW (){
        return this.anzLKW;
    }

    public int getPKW (){
        return this.anzPKW;
    }

    public void setLKW(int anz){
        if (anz >= 0){
            this.anzLKW = anz;
        }
        else{
            System.out.println("Anzahl darf nicht negativ sein!");
        }
    }

    public void setPKW(int anz){
        if (anz >= 0){
            this.anzPKW = anz;
        }
        else{
            System.out.println("Anzahl darf nicht negativ sein!");
        }
    }
    
    @Override
    public String toString(){
        String out = "";
        out += "Einnahmen: " + this.einnahmen;
        out +="Anzahl PKW: " + this.getPKW();
        out +="Anzahl LKW: " + this.getLKW();
        out +="Gesamt: " + (this.anzPKW + this.anzLKW);
        return out;
    }

    
}
