import org.example.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSqr(55, 70);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcExact1() {
        SQRService service = new SQRService();

        int expected = 4;
        int actual = service.calcSqr(11, 16);

        Assertions.assertEquals(expected, actual);

    }
}