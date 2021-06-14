package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor guest1;
    Visitor guestChild;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        guest1 = new Visitor(65, 180, 50.00);
        guestChild = new Visitor(14, 160, 250.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void allowedToSmoke(){
        assertEquals(true, tobaccoStall.isAllowedTo(guest1));
    }

    @Test
    public void tooYoungToSmoke() {
        assertEquals(false, tobaccoStall.isAllowedTo(guestChild));
    }
}
