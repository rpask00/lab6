
interface Plywanie {
    public void plyn();
    public void wynurz();
    public void zanurz();

}

interface Latanie {
    public void lec();
    public void wyladuj();
}

abstract class Zwierze  {
}

abstract class Ryba extends Zwierze implements Plywanie  {
     @Override
     public void plyn() {
        System.out.println("plyn...");
     }

     @Override
     public void wynurz() {
         System.out.println("wynurz...");
     }

     @Override
     public void zanurz() {
         System.out.println("zanurz...");
     }
    public void jedz() {
        System.out.println("jedz...");
    }
    public void wydalaj() {
        System.out.println("wydalaj...");
    }


}


public class Zad2 {
    public static void main (String[] args) {

     var wieloryb = new Wieloryb();
     wieloryb.plyn();
     wieloryb.wynurz();
     wieloryb.zanurz();
     wieloryb.jedz();
     wieloryb.wydalaj();
    }
}