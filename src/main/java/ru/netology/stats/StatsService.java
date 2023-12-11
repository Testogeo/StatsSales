package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {

        return sum(sales) / sales.length;
    }

    public int calcMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int calcMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMinimum] >= sales[i]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int calcMonthBelowAverage(long[] sales) {
        int counter = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }

        }
        return counter;
    }

    public int calcMonthUnderAverage(long[] sales) {
        int counter = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }

        }
        return counter;
    }

}
