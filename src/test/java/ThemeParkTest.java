import attractions.RollerCoaster;
import org.junit.Before;
import people.Visitor;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;
    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        themePark = new ThemePark();
        visitor = new Visitor();
        rollerCoaster = new RollerCoaster();
    }


}
