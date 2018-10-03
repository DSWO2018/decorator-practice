package calibrating.imp;

import console.PlayStation4;
import discs.Ext.DvdDisc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Palaf on 15/09/2018.
 */
public class DvdCalibratorTest {
    DvdDisc dvdDisc;
    PlayStation4 playStation4;

    @Before
    public void setUp(){
        dvdDisc = new DvdDisc();
        playStation4 =  new PlayStation4();
    }

    @Test
    public void testCalibrating() {
        assertEquals("I'm calibrating a Dvddisc", playStation4.readDisc(dvdDisc));
    }
}