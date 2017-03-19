package reagroup.toyrobot;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import reagroup.toyrobot.model.Table;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Praitheesh on 18/3/17.
 */
public class ToyRobotSimulatorTest {

    public static final String PLACE_COMMAND_FIRST = "Please place your ToyRobot on the table by type PLACE X,Y,F";
    public static final String INVALID_INPUT = "Invalid input.";
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ToyRobotSimulator simulator = new ToyRobotSimulator(new Table(5,5));

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
        simulator.executeInput("MOVE");
        Assert.assertEquals(PLACE_COMMAND_FIRST, outContent.toString().trim());
    }

    @Test
    public void testInvalidInput(){
        simulator.executeInput("Invalid Input");
        Assert.assertTrue(outContent.toString().trim().contains(INVALID_INPUT));
    }

    @Test
    public void testInvalidPlaceInput1(){
        simulator.executeInput("PLACE 4e,2,NORTH");
        Assert.assertTrue(outContent.toString().trim().contains(INVALID_INPUT));
    }

    @Test
    public void testInvalidPlaceInput2(){
        simulator.executeInput("PLACE 2,NORTH");
        Assert.assertTrue(outContent.toString().trim().contains(INVALID_INPUT));
    }

    @Test
    public void testInvalidPlaceInput3(){
        simulator.executeInput("PLACE NORTH,2,4");
        Assert.assertTrue(outContent.toString().trim().contains(INVALID_INPUT));
    }

    @Test
    public void testvalidPlaceInput(){
        simulator.executeInput("PLACE      2  , 4 ,  EAST");
        Assert.assertTrue(outContent == null || outContent.toString().isEmpty());
    }

    @Test
    public void testExampleA(){
        simulator.executeInput("PLACE 0,0,NORTH");
        simulator.executeInput("MOVE");
        simulator.executeInput("REPORT");
        Assert.assertTrue(outContent.toString().trim().contains("0,1,NORTH"));
    }

    @Test
    public void testExampleB(){
        simulator.executeInput("PLACE 0,0,NORTH");
        simulator.executeInput("LEFT");
        simulator.executeInput("REPORT");
        Assert.assertTrue(outContent.toString().trim().contains("0,0,WEST"));
    }

    @Test
    public void testExampleC(){
        simulator.executeInput("PLACE 1,2,EAST");
        simulator.executeInput("MOVE");
        simulator.executeInput("MOVE");
        simulator.executeInput("LEFT");
        simulator.executeInput("MOVE");
        simulator.executeInput("REPORT");
        Assert.assertTrue(outContent.toString().trim().contains("3,3,NORTH"));
    }
}
