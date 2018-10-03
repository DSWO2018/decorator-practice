package calibrating.imp;

import console.PlayStation4;
import discs.Ext.BlurayDisc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Palaf on 15/09/2018.
 */
public class BlurayCalibratorTest {

    BlurayDisc blurayDisc;
    PlayStation4 playStation4;

    @Before
    public void setUp(){
        blurayDisc = new BlurayDisc();
        playStation4 =  new PlayStation4();
    }

    @Test
    public void testCalibrating() {
        assertEquals("I'm calibrating a bluyray disc",playStation4.readDisc(blurayDisc));
    }
}