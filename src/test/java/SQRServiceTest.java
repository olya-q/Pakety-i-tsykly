import org.example.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testWhenExpectedNotEqualActual() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenOneSquaresFound() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqr(750, 800);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenTwoSquaresFound() {
        SQRService service = new SQRService();

        int expected = 2;
        int actual = service.calcSqr(100, 130);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testRangeLimits() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqr(100, 9801);

        Assertions.assertEquals(expected, actual);

    }
}