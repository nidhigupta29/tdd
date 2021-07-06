package co.interleap.courses.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelCounterTest {

    @Test
    public void isEmptyString(){
        VowelCounter vowelCounter = new VowelCounter();
        assertEquals(0, vowelCounter.getNumber(""));
    }

    @Test
    public void singleVowel(){
        assertEquals(1,new VowelCounter().getNumber("e"));
    }

    @Test
    public void multipleVowel(){
        assertEquals(4,new VowelCounter().getNumber("aaii"));
    }

    @Test
    public void mixedWord(){
        assertEquals(2, new VowelCounter().getNumber("Nidhi"));
    }

}