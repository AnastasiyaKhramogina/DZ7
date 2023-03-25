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

    public int maxSales(int[] sales) {
        int maxMonth = 0; //

        for (int i = 0; i > sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
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

    public int minAverageSalesPerMonth(int[] sales) {
        int min = minAverageSalesPerMonth(sales);
        int quantityMinMonth = 0;


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < min) {
                quantityMinMonth = i;
            }
        }

        return quantityMinMonth + 1;
    }

    public int maxAverageSalesPerMonth(int[] sales) {
        int max = maxAverageSalesPerMonth(sales);
        int quantityMaxMonth = 0;


        for (int i = 0; i > sales.length; i++) {
            if (sales[i] > max) {
                quantityMaxMonth = i;
            }
        }

        return quantityMaxMonth + 1;
    }
}