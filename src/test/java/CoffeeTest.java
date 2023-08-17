import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CoffeeTest {

    private Coffee emptyCoffee;
    private Coffee actualCoffee;

    @Before
    public void setup(){
        actualCoffee = new Coffee("The Bean-i-nator", "espresso", 5.99);

    }
    @Test
    public void testCoffeeNoArgConstructor(){
        actualCoffee = new Coffee();

//        // assert that emptyCoffee is null
        assertNull(emptyCoffee);
//        // assert that actualCoffee is not null
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeThreeArgContructor(){
        assertNotNull(actualCoffee);
    }
    @Test
    public void testCoffeeGetters(){
        assertEquals(actualCoffee.getName(), "The Bean-i-nator");
        assertEquals(actualCoffee.getRoast(), "espresso");
        assertEquals(actualCoffee.getPrice(), 5.99, 0.00001);
    }

    @Test
    public void testCoffeeSetters(){
        actualCoffee.setName("The Bean-i-nator Too");
        assertEquals(actualCoffee.getName(), "The Bean-i-nator Too");
        actualCoffee.setRoast("Dark");
        assertEquals(actualCoffee.getRoast(), "Dark");
        actualCoffee.setPrice(6.50);
        assertEquals(actualCoffee.getPrice(), 6.50, 0.00001);
    }
}
