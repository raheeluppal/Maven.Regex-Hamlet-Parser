import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        HamletParser hp = new HamletParser();
        String expected = hamletText.replaceAll("Hamlet","Leon");
        String actual = hp.changeHamletToLeon();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        HamletParser hp = new HamletParser();
        String expected = hamletText.replaceAll("Horatio","Tariq");
        String actual = hp.changeHoratioToTariq();
        Assert.assertEquals(expected,actual);
    }

}