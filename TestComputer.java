

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestComputer
{
    @Test 
    public void testZuSmall()
    {
        
        Computer lenovo = new Computer("Lenovo", true, 890, 900);
        
        assertEquals (lenovo.getMhz(),2000);
        
    }
    
    @Test
    public void testZuBig()
    {
        Computer lenovo= new Computer ("Lenovo", true, 890, 5000);
        
        assertEquals (lenovo.getMhz(),2000);
        
        
    }
    
   
}
