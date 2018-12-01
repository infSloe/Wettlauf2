import javakarol.Roboter;
import javakarol.Welt;
/**
 * Die Klasse Wettlauf
 */
public class Wettlauf2
{
    // Attribute
    private Welt welt;
    private LaufRoboter robo1, robo2;

    // Konstruktor
    public Wettlauf2()
    {
        welt = new Welt(10,10,6);
        robo1 = new LaufRoboter(1,1,welt);
        robo2 = new LaufRoboter(2,1,welt);
    }

    // Methoden

    public void los()
    {
       RoboAufgabe r1 = new RoboAufgabe(robo1);
       RoboAufgabe r2 = new RoboAufgabe(robo2);
       Thread t1 = new Thread(r1);
       Thread t2 = new Thread(r2);
       t1.start();
       t2.start();
    }

    
}
