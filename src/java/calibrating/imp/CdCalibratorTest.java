package calibrating.imp;

import console.PlayStation4;
import discs.Ext.CdDisc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Palaf on 15/09/2018.
 */
public class CdCalibratorTest {

    CdDisc cdDisc;
    PlayStation4 playStation4;

    @Before
    public void setUp(){
        cdDisc = new CdDisc();
        playStation4 =  new PlayStation4();
    }

    @Test
    public void testCalibrating() {
        assertEquals("I'm calibrating music cd",playStation4.readDisc(cdDisc));
    }
}