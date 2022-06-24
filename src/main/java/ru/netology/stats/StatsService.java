package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) { //Сумма всех продаж
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double mediumSales(long[] sales) { //Средняя сумма продаж в месяц
        int sum = 0;
        double medium=0;
        for (long sale : sales) {
            sum += sale;
        }
        medium=(double)sum/sales.length;
        return medium;
    }

    public int maxSales(long[] sales) { //Номер месяца, в котором был пик продаж
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { //Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowMediumSales(long[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего
        int month = 0;
        int belowMonth=0;
        for (long sale : sales) {
            if (sale < mediumSales(sales)) {
                belowMonth++;
            }
            month = month + 1;
        }
        return belowMonth;
    }

    public int aboveMediumSales(long[] sales) { //Кол-во месяцев, в которых продажи были выше среднего
        int month = 0;
        int aboveMonth=0;
        for (long sale : sales) {
            if (sale > mediumSales(sales)) {
                aboveMonth++;
            }
            month = month + 1;
        }
        return aboveMonth;
    }
}
