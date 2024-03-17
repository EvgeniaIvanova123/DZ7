package ru.netology.stats;

public class MonthService {
    public long minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return (int) sum;
    }

    public long avgSales(long[] sales) {

        return sumSales(sales) / sales.length;
    }

    public long minAvgSales(long[] sales) {
        long avg = avgSales(sales);
        long minAvgMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                minAvgMonth++;
            }
        }
        return minAvgMonth;
    }

    public long maxAvgSales(long[] sales) {
        long avg = avgSales(sales);
        long maxAvgMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                maxAvgMonth++;
            }
        }
        return maxAvgMonth;
    }
}
