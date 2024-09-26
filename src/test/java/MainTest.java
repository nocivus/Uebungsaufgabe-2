import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void printGreetingTest() {
        assertEquals("Hello Tom", Main.printGreeting("Tom"));
        assertEquals("Hello Tom"+System.lineSeparator(), outContent.toString());
    }

    @Test
    void calculateTestSum() {
        assertEquals(2f, Main.calculate(1, 1, "sum"));
        assertEquals("1 + 1 = 2.0"+System.lineSeparator(), outContent.toString());
    }

    @Test
    void calculateTestDif() {
        assertEquals(5, Main.calculate(10, 5, "difference"));
        assertEquals("10 - 5 = 5.0"+System.lineSeparator(), outContent.toString());
    }

    @Test
    void calculateTestProd() {
        assertEquals(10, Main.calculate(5, 2, "product"));
        assertEquals("5 * 2 = 10.0"+System.lineSeparator(), outContent.toString());
    }

    @Test
    void calculateTestQuotZero() {
        assertEquals(-1, Main.calculate(1, 0, "quotient"));
        assertEquals("Teilen durch 0 nicht möglich"+System.lineSeparator(), outContent.toString());
    }

    @Test
    void calculateTestQuot() {
        assertEquals(2, Main.calculate(100, 50, "quotient"));
        assertEquals("100 / 50 = 2.0"+System.lineSeparator(), outContent.toString());
    }

    @Test
    void calculateInvalid() {
        Main.calculate(1, 1, "modulo");
        assertEquals("Unbekannte Operation"+System.lineSeparator(), outContent.toString());
    }

    @ Test
    void calculatePerimeterSquareTest() {
        assertEquals(8, Main.calculatePerimeter(2));
        assertEquals(-1, Main.calculatePerimeter(-1));
    }

    @Test
    void calculatePerimeterRectangle() {
        assertEquals(10, Main.calculatePerimeter(1, 4));
        assertEquals(-1, Main.calculatePerimeter(-1, 2));
        assertEquals(-1, Main.calculatePerimeter(4, -1));

    }

    @Test
    void countEvenNumbersTest() {
        assertEquals(2, Main.countEvenNumbers(new int[] {1, 2, 3, 4, 5}));
        assertEquals(0, Main.countEvenNumbers(new int[] {-3, -7, 5, 101}));
        assertEquals(3, Main.countEvenNumbers(new int[] {6, 6, 6}));
    }

    @Test
    void findEvenNumbersTest() {
        assertArrayEquals(new int[]{1, 3}, Main.findEvenNumbers(new int[] {1, 2, 3, 4, 5}));
        assertArrayEquals(new int[0], Main.findEvenNumbers(new int[] {-3, -7, 5, 101}));
        assertArrayEquals(new int[] {0, 1, 2}, Main.findEvenNumbers(new int[] {6, 6, 6}));
    }
}