 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortCalculatorTest {
    
    private ShortCalculator shortCalculator;
    
    @Before
    public void setUp(){
        shortCalculator = new ShortCalculator((short) 24, (short)4);
    }
    
        @Test
    public void findSumUsingShortCalculatorTest(){
        // :Given
        short expected = 28;

        // :When
        short actual = shortCalculator.getSum();

        // :Then
        Assert.assertEquals("The Sum should be 28", expected, actual);
    }
    
        @Test
    public void findDifferenceUsingShortCalculatorTest(){
        // :Given
        short expected = 20;

        // :When
        short actual = shortCalculator.getDifference();

        // :Then
        Assert.assertEquals("The Difference should be 9", expected, actual);
    }
    
        @Test
    public void findProductUsingShortCalculatorTest(){
        // :Given
        short expected = 96;

        // :When
        short actual = shortCalculator.getProduct();

        // :Then
        Assert.assertEquals("The Product should be 12", expected, actual);
    }
    
        @Test
    public void findQuotientUsingShortCalculatorTest(){
        // :Given
        short expected = 6;

        // :When
        short actual = shortCalculator.getQuotient();

        // :Then
        Assert.assertEquals("The Quotient should be 6", expected, actual);
    }
    
        @Test
    public void findRemainderUsingShortCalculatorTest(){
        // :Given
        short expected = 0;

        // :When
        short actual = shortCalculator.getRemainder();

        // :Then
        Assert.assertEquals("The Remainder should be 0", expected, actual);
    }
}
