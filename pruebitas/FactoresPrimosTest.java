import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FactoresPrimosTest {
    @Test
    public void generarTest() throws Exception {
        List<Integer> factores = Arrays.asList(2,3,5,11);
        assertEquals(factores,FactoresPrimos.generar(330));
    }

}