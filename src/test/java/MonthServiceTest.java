import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.MonthService;


public class MonthServiceTest {
    @Test
    public void shouldFindMinSales() {
        MonthService service = new MonthService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        long actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxSales() {
        MonthService service = new MonthService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        long actualMonth = service.maxSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindSumSales() {
        MonthService service = new MonthService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 180;
        long actualMonth = service.sumSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAvgSales() {
        MonthService service = new MonthService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 15;
        long actualMonth = service.avgSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinAvgSales() {
        MonthService service = new MonthService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        long actualMonth = service.minAvgSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxAvgSales() {
        MonthService service = new MonthService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        long actualMonth = service.maxAvgSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
