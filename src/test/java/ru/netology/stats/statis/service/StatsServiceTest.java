package ru.netology.stats.statis.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.statis.service.StatsService;

public class StatsServiceTest {

    @Test
    public void numberMonthMinSales() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMinSales = 9;
        int actualMonthMinSales = service.minSales(sales);
        Assertions.assertEquals(expectedMonthMinSales, actualMonthMinSales);
    }

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumSales = 180;
        long actualSumSales = service.sumAllSales(sales);
        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSales = 15;
        long actualAverageSales = service.averageSummSales(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void numberLastMonthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMaxSales = 8;
        int actualMonthMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMonthMaxSales, actualMonthMaxSales);
    }

    @Test
    public void NumbMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;
        int actualBelowAverage = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void NumbMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 5;
        int actualAboveAverage = service.monthsAboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }

}
