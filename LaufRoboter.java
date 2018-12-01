import javakarol.Roboter;
import javakarol.Welt;

/**
 * Die Klasse LaufRoboter
 */
public class LaufRoboter extends Roboter
{
    // Attribute
    // Konstruktor
    public LaufRoboter(int x, int y, Welt welt)
    {
        super(x,y,'S',welt);

    }

    // Methoden
    public void laufen()
    {
        while (IstWand()==false)
        {
            if (Math.random() > 0.5)
            {
                Schritt();
            }
            else
            {
                Warten(0.3f);
            }
        }
    }

}
