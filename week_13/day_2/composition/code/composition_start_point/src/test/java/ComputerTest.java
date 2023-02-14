import behaviours.IOutput;
import device_management.Computer;
import device_management.Monitor;
import device_management.Printer;
import device_management.Speaker;
import org.junit.Before;
import org.junit.Test;
import org.omg.IOP.IOR;

import static org.junit.Assert.*;

public class ComputerTest {
    Computer computer;
    Monitor monitor;

//    Printer printer;


    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice(){
        IOutput outputDevice = computer.getOutputDevice();
        System.out.println("Type " + outputDevice.getClass() );
        System.out.println(outputDevice instanceof Monitor);
        assertNotNull(outputDevice);
        assertTrue(outputDevice instanceof Monitor);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Samsng", "Stylis", 123, 4);
        computer = new Computer(8 , 512, printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataVIaSpeaker(){
        Speaker speaker = new Speaker(199);
        Computer computer = new Computer(8, 324, speaker);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOUtputDevice(){
        Printer printer = new Printer("Epson", "balc", 1220, 4);
        Computer computer = new Computer(8, 512, printer);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }
}
