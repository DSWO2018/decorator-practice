package calibrating.imp;

import console.PlayStation4;
import discs.Ext.DataDisc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Palaf on 15/09/2018.
 */
public class DataCalibratorTest {
    DataDisc dataDisc;
    PlayStation4 playStation4;

    @Before
    public void setUp(){
        dataDisc = new DataDisc();
        playStation4 =  new PlayStation4();
    }

    @Test
    public void testCalibrating() {
        assertEquals("I'm calibrating a blyray disc", playStation4.readDisc(dataDisc));
    }
}