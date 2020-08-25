import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void getPaper() {
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void getToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void printerPrinting() {
        printer.print(55, 1);
        assertEquals(45, printer.getPaper());
    }

    @Test
    public void printerNotPrintingIfNotEnoughPaper() {
        assertEquals("Not enough paper!", printer.print(55, 2));
    }

    @Test
    public void printerIsReducingTonerWhenPrinter() {
        printer.print(1, 2);
        assertEquals(98, printer.getToner());
    }

}