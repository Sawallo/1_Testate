import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Rule104Test {

    private Rule104 rule104;

    @Before
    public void setUp() throws Exception {
        rule104 = new Rule104();
    }

    @Test
    public void testTwoNeighborsGivingBirth() {
        boolean[] initial = new boolean[]{true, false, true};
        boolean[] nextGeneration = rule104.evolve(initial);
        boolean[] expectedGeneration = new boolean[]{true, true, true};
        assertArrayEquals("Two neighbors giving birth", nextGeneration, expectedGeneration);
    }


    @Test
    public void testTwoDeadNeighborsLeft(){
        boolean[] initial = new boolean[]{false, false, true};
        boolean[] nextGeneration = rule104.evolve(initial);
        boolean[] expectedGeneration = new boolean[]{false, false, true};
        assertArrayEquals("Two Left dead neighbors", nextGeneration, expectedGeneration);
    }


    @Test
    public void testTwoAliveNeighborsSoDeath(){
        boolean[] initial = new boolean[]{true, true, true};
        boolean[] nextGeneration = rule104.evolve(initial);
        boolean[] expectedGeneration = new boolean[]{true, false, true};
        assertArrayEquals("Two Left dead neighbors", nextGeneration, expectedGeneration);
        
    }

    @Test
    public void bro(){
        boolean[] initial = new boolean[]{true, true, true};
        boolean[] nextGeneration = rule104.evolve(initial);
        boolean[] expectedGeneration = new boolean[]{true, false, true};
        assertArrayEquals("Two Left dead neighbors", nextGeneration, expectedGeneration);
        
    }




    

}