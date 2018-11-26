package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void printOwing() {
//        System.out.print("hello");
//        assertEquals("hello", outContent.toString());
    }

    @Test
    public void should_print_owing(){
        double amount = 2.5;
        OwingPrinter owingPrinter = new OwingPrinter();
        Order order = new Order(amount);
        List<Order> orders = new ArrayList<Order>();
        orders.add(order);

        owingPrinter.printOwing("ABC",orders);
        String expectResult = "*****************************\r\n";
        expectResult+="****** Customer totals ******\r\n";
        expectResult+="*****************************\r\n";
        expectResult+="name: ABC\r\n";
        expectResult+="amount: 2.5\r\n";
//        System.out.println(outContent.toString());
        assertEquals(expectResult, outContent.toString());
    }
}