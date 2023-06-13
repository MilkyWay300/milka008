package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatsServiceTest {
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 180;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testAverrageAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageAmount(sales);
        long expected = 180 / sales.length;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testPeakSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.peakSales(sales);
        long expected = 7;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 8;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testAveregeMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averegeMinSales(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testAveregeMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averegeMaxSales(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);

    }
}