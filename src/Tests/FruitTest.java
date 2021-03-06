package Tests;

import gameClient.Fruits;
import org.junit.jupiter.api.Test;
import utils.Point3D;

import static org.junit.jupiter.api.Assertions.fail;

class fruitTest {

    /**
     * Fruit tests.
     *
     * @author Bar Genish
     * @author Elyashiv Deri
     * @author lioz elmalem
     */
    @Test
    void NewFruit_and_to_stirngtest() {
        Fruits f = new Fruits(new Point3D(4, 2, 0), 5,1);
        Fruits f2 = new Fruits( 4, 2, 0, 4,1);
        if (f.toString().equals(f2.toString())) {
            fail("Constractor problem");
        }
        f2.setValue(5);
        if (!f.toString().equals(f2.toString())) {
            fail("Setweight problem");
        }
        f2.setType(-1);
        if (f.toString().equals(f2.toString())) {
            fail("Setid problem");
        }

    }
}
