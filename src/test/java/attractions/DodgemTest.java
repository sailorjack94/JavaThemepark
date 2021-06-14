package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor guest1;
    Visitor guest2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        guest1 = new Visitor(26, 180, 100.00);
        guest2 = new Visitor(11, 140, 10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.00);
    }

    @Test
    public void getPriceForTallVisitor(){
        assertEquals(4.50, dodgems.priceFor(guest1),0.00);
    }

    @Test
    public void getReviewName(){
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void getPriceKids(){
        assertEquals(2.25, dodgems.priceFor(guest2), 0.00);
    }
}
