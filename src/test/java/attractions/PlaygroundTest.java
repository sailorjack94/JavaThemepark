package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor guest1;
    Visitor guestChild;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        guest1 = new Visitor(26, 200, 100.00);
        guestChild = new Visitor(14, 150, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void playerTooOld(){
        assertEquals(false, playground.isAllowedTo(guest1));
    }

    @Test
    public void playerAllowed(){
        assertEquals(true, playground.isAllowedTo(guestChild));
    }
}
