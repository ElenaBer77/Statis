package ru.netology.stats.statis.service;

public class StatsService {

    public long minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sumAllSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSummSales(long[] sales) {
        int numberMonths = sales.length; //количество месяцев: значений в массиве
        long averageSal = 0;
        for (long sale : sales) {
            averageSal += sale;
        }
        long averageSale = averageSal / numberMonths;
        return averageSale;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {

        long averageSale = averageSummSales(sales); //среднии продажи
        int monthBelowAverage = 0; //переменная для счета месяцев ниже среднего
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                monthBelowAverage = monthBelowAverage + 1;
            }
        }
        return monthBelowAverage;
    }

    public int monthsAboveAverage(long[] sales) {

        long averageSale = averageSummSales(sales); //среднии продажи
        int monthAboveAverage = 0; //переменная для счета месяцев ниже среднего
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                monthAboveAverage = monthAboveAverage + 1;
            }
        }
        return monthAboveAverage;
    }

}

















