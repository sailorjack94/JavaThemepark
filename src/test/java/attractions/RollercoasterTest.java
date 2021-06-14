package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor guest1;
    Visitor guest2;
    Visitor guest3;
    Visitor guestTall;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        guest1 = new Visitor(24, 140, 100.00);
        guest2 = new Visitor(11, 150, 10.0);
        guest3 = new Visitor(10, 120, 50.00);
        guestTall = new Visitor(19, 210, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void getVisitorPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(guest1), 0.00);
    }

    @Test
    public void visitorTooSmall(){
        assertEquals(false, rollerCoaster.isAllowedTo(guest1));
    }

    @Test
    public void visitorTooYoung(){
        assertEquals(false, rollerCoaster.isAllowedTo(guest2));
    }

    @Test
    public void visitorJustNo(){
        assertEquals(false, rollerCoaster.isAllowedTo(guest3));
    }

    @Test
    public void doubleForTall(){
        assertEquals(16.80, rollerCoaster.priceFor(guestTall), 0.00);
    }
}
