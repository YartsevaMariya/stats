package ru.netology.stats;

public class StatsService {
    public long totalSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageSale(long[] sales) {
        long result = totalSales(sales) / 12;
        return result;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }

        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }

        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }

        }
        return counter;
    }

    public int monthsOverAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }

        }
        return counter;
    }
}


