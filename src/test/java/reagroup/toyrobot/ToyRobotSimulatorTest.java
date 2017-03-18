package reagroup.toyrobot;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Praitheesh on 18/3/17.
 */
public class ToyRobotSimulatorTest {

    public static final String PLACE_COMMAND_FIRST = "Please place your ToyRobot on the table by type PLACE X,Y,F";
    public static final String INVALID_INPUT = "Invalid input.";
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams(){
        System.setOut(null);
    }

    @Test
    public void testNonPlaceCommandFirst() {
        ToyRobotSimulator simulator = new ToyRobotSimulator();
        simulator.executeInput("MOVE");
        Assert.assertEquals(PLACE_COMMAND_FIRST, outContent.toString().trim());
    }

    @Test
    public void testInvalidInput(){
        ToyRobotSimulator simulator = new ToyRobotSimulator();
        simulator.executeInput("Invalid Input");
        Assert.assertTrue(outContent.toString().trim().contains(INVALID_INPUT));
    }

    @Test
    public void testInvalidPlaceInput1(){
        ToyRobotSimulator simulator = new ToyRobotSimulator();
        simulator.executeInput("PLACE 4,2,NORTH");
        Assert.assertTrue(outContent.toString().trim().contains(INVALID_INPUT));
    }

    @Test
    public void testInvalidPlaceInput2(){
        ToyRobotSimulator simulator = new ToyRobotSimulator();
        simulator.executeInput("PLACE 2,NORTH");
        Assert.assertTrue(outContent.toString().trim().contains(INVALID_INPUT));
    }

    @Test
    public void testInvalidPlaceInput3(){
        ToyRobotSimulator simulator = new ToyRobotSimulator();
        simulator.executeInput("PLACE NORTH,2,4");
        Assert.assertTrue(outContent.toString().trim().contains(INVALID_INPUT));
    }

    @Test
    public void testvalidPlaceInput(){
        ToyRobotSimulator simulator = new ToyRobotSimulator();
        simulator.executeInput("PLACE      2  , 4 ,  EAST");
        Assert.assertTrue(outContent == null || outContent.toString().isEmpty());
    }
}
