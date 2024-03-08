package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        MonthService calc = new MonthService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = calc.minSales(arr);
        int result2 = calc.maxSales(arr);
        int result3 = calc.sumSales(arr);
        int result4 = calc.avgSales(arr);
        int result5 = calc.minAvgSales(arr);
        int result6 = calc.maxAvgSales(arr);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}
