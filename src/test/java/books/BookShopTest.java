package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {
	
	
    private final Bookshop bookshop = new Bookshop (harryPotterList);
	

	

    @Test
    public void myFirstTest(){
        assertEquals(8,bookshop.cost([1,0,0,0,0]));
        assertEquals(14.88,bookshop.cost([1,1,0,0,0]));
        assertEquals(20.64,bookshop.cost([1,1,1,0,0]));
        assertEquals(23.04,bookshop.cost([1,1,1,1,0]));
        assertEquals(26,bookshop.cost([1,1,1,1,1]));
        assertEquals(24,bookshop.cost([1,1,1,1,2]));
        assertEquals(0,bookshop.cost([0,0,0,0,0]));
        
        

    }
}