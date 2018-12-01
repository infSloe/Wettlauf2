
/**
 * Die Klasse RoboAufgabe
 */
public class RoboAufgabe implements Runnable
{
    // Attribute
    private LaufRoboter robo;

    // Konstruktor
    public RoboAufgabe(LaufRoboter robo_)
    {
        robo = robo_;
    }

    // Methoden
    public void run()
    {
        robo.laufen();
    }

}
