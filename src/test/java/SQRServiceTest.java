import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 2;
        int result = service.getSquareCount(400,500);

        Assertions.assertEquals(expected, result);

    }
}
