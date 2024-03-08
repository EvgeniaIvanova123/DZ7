package ru.netology.stats;

public class MonthService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
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

    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }

        return sum;
    }

    public int avgSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int minAvgSales(long[] sales) {
        int avg = avgSales(sales);
        int minAvgMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                minAvgMonth++;
            }
        }
        return minAvgMonth;
    }

    public int maxAvgSales(long[] sales) {
        int avg = avgSales(sales);
        int maxAvgMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                maxAvgMonth++;
            }
        }
        return maxAvgMonth;
    }
}
