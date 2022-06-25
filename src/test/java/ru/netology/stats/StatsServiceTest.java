package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() { //Сумма всех продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMedium() { //Средняя сумма продаж в месяц
        StatsService service = new StatsService();

        long[] sales = {6, 7, 8, 1, 4, 5, 6, 2, 3, 10, 2, 9};

        double actual = service.mediumSales(sales);
        double expected = 5.25;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() { //Номер месяца, в котором был пик продаж
        StatsService service = new StatsService();

        long[] sales = {23, 47, 18, 41, 45, 25, 16, 20, 31, 10, 47, 9};

        int actual = service.maxSales(sales);
        int expected = 11;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() { //Номер месяца, в котором был минимум продаж
        StatsService service = new StatsService();

        long[] sales = {23, 47, 9, 41, 45, 25, 16, 20, 31, 10, 47, 9};

        int actual = service.minSales(sales);
        int expected = 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowMediumSales() { //Кол-во месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();

        long[] sales = {6, 7, 8, 1, 4, 5, 6, 2, 3, 10, 2, 9};

        int actual = service.belowMediumSales(sales);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMediumSales() { //Кол-во месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();

        long[] sales = {6, 7, 8, 10, 4, 5, 6, 2, 3, 10, 2, 9};

        int actual = service.aboveMediumSales(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}
