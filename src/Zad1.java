
interface Lata {
    public void lec();
}

interface Plywa {
    public void plyn();
}

class Samolot implements Lata {

    public void lec(){
        System.out.println ("Samolot lata");

    }
}
class Statek implements Plywa {

    public void plyn(){
        System.out.println ("Statek plywa");
    }
}

public class Zad1 {
    public static void main (String[] args) {

        Lata plane = new Samolot();
        plane.lec();

        Plywa ship = new Statek();
        ship.plyn();

    }
}