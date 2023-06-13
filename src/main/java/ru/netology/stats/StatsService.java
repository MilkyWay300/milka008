package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        return allSale;
    }

    public long averageAmount(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        long averageAmount = allSale / sales.length;
        return averageAmount;
    }

    public int peakSales(long[] sales) {
        int peakSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakSales]) {
                peakSales = i;
            }
        }
        return peakSales;
    }

    public int minSales(long[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }

    public int averegeMinSales(long[] sales) {
        int count = 0;
        long averegeSale = averageAmount(sales);
        for (long sale : sales) {
            if (sale < averegeSale) {
                count++;
            }
        }
        return count;
    }

    public int averegeMaxSales(long[] sales) {
        int count = 0;
        long averegeSale = averageAmount(sales);
        for (long sale : sales) {
            if (sale > averegeSale) {
                count++;
            }
        }
        return count;
    }
}