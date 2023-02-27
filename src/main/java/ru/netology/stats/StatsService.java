package ru.netology.stats;

public class StatsService {
    public static int sumAmount(long[] sales) {
        int myArray[] = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {

            sum = sum + myArray[i];
        }
        System.out.println(sum);

        return sum;
    }

    public static int averageSumAmount(long[] sales) {
        int myArray[] = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + myArray[i];
        }
        int averageSum = sum / 12;
        System.out.println(averageSum);

        return averageSum;
    }

    public static int monthMaximumSales(long[] sales) {
        int myArray[] = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSalesMonth(long[] sales) {
        int minAverage = 0;
        double averageSum = 15;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                minAverage++;
            }
        }
        return minAverage;
    }

    public int maxSalesMonth(long[] sales) {
        int maxAverage = 0;
        double averageSum = 15;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                maxAverage++;
            }
        }
        return maxAverage;
    }
}





