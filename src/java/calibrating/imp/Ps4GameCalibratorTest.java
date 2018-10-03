package calibrating.imp;

import console.PlayStation4;
import discs.Ext.Ps4Disc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Palaf on 15/09/2018.
 */
public class Ps4GameCalibratorTest {
    Ps4Disc ps4Disc;
    PlayStation4 playStation4;

    @Before
    public void setUp(){
        ps4Disc = new Ps4Disc();
        playStation4 =  new PlayStation4();
    }

    @Test
    public void testCalibrating() {
        assertEquals("I'm calibrating a ps4 game", playStation4.readDisc(ps4Disc));
    }
}