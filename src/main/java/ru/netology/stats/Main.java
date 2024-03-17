package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        MonthService calc = new MonthService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long result = calc.minSales(arr);
        long result2 = calc.maxSales(arr);
        long result3 = calc.sumSales(arr);
        long result4 = calc.avgSales(arr);
        long result5 = calc.minAvgSales(arr);
        long result6 = calc.maxAvgSales(arr);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}
