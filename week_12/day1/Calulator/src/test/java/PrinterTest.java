import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PrinterTest {

    private Printer printer;
    @Before
    public void setup(){
        printer = new Printer(2, 4);
    }

    @Test
    public void printerTotalSheetsLeft(){
        assertEquals(30, printer.getTotalPages());
    }

    @Test
    public void printerCartridge(){
        assertEquals(20, printer.getCartridgeTotal());
    }

    @Test
    public void printingpagesChnagesSheetsTotal(){
        assertEquals(" 8 printed 22 sheetsleft 12 toner left", printer.print());
    }

}
