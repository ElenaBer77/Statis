package ru.netology.stats.statis.service;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumAllSales(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public int averageSummSales(int[] sales) {
        int numberMonths = sales.length; //количество месяцев: значений в массиве
        int averageSal = 0;
        for (int sale : sales) {
            averageSal += sale;
        }
        int averageSale = averageSal / numberMonths;
        return averageSale;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    //public int belowAverage(int[] sales){
    // int av
}











