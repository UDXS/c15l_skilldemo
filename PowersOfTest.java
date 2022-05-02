import static org.junit.Assert.*;

import java.nio.file.*;
import java.util.*;

import org.junit.*;

public class PowersOfTest {
    @Test
    public void testPowersAtPositive() {
        // 2^3 = 8
        int expected = 8;

        PowersOf obj = new PowersOf(2);
        assertEquals(expected, obj.powerAt(3));
    }

}