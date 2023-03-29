package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSale = (int) (sumSale + sales[i]);
        }
        return sumSale;
    }

    public int averageSalesPerMonth(int[] sales) {
        int averageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSales = (int) (averageSales + sales[i]);
        }
        int averageSalesMonth;
        averageSalesMonth = averageSales / sales.length;
        return averageSalesMonth;
    }

    public int monthMaximumSale(int[] sales) {
        int monthMaximum = 0;
        int saleMaximum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum=sales[i];
            }
        }

        return monthMaximum + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int salesPerMonthBelowAverage(int[] sales) {
        int averageSalesMonth = averageSalesPerMonth(sales);
        int quantityMinMonth = 0;


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesMonth) {
                quantityMinMonth+=1;
            }
        }

        return quantityMinMonth;
    }

    public int maxAverageSalesPerMonth(int[] sales) {
        int max = averageSalesPerMonth(sales);
        int quantityMaxMonth = 0;


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max) {
                quantityMaxMonth+=1;
            }
        }

        return quantityMaxMonth;
    }
}