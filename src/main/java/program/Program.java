package program;

import model.*;
import util.ArraysUtil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;


public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1
        Integer[] integers = new Integer[]{-1, 0, -5, 6, 3, 2, -10, 0, 15};

        // 1.1

        /**
         * На массиве целых чисел произвести фильтрацию и удаление
         * Положительных чисел, используя реализацию интерфейса через класс
         */
        /*System.out.println(integers);
        Integer[] filter = ArraysUtil.filter(integers, new PositiveNumberFilter());
        System.out.println(Arrays.toString(filter));
        Integer[] filter1 = ArraysUtil.filter(integers, new PositiveNumberFunction());
        System.out.println(Arrays.toString(filter1));*/

        //1.2
        /**
         * На массиве целых чисел произвести фильтрацию и удаление
         * Чисел, равных заданному числу с клавиатуры, используя анонимный внутренний класс
         */
        /*
        System.out.println("Введите число для фильтрации");
        int number = scanner.nextInt();
        Integer[] integers2 = ArraysUtil.filter(integers, new Filter<Integer>() {
            @Override
            public boolean apply(Integer integer) {
                return integer != number;
            }
        });
        System.out.println(Arrays.toString(integers2));

        Integer[] filter3 = ArraysUtil.filter(integers, new Function<Integer, Boolean>() {
            @Override
            public Boolean apply(Integer integer) {
                return integer != number;
            }
        });
        System.out.println(Arrays.toString(filter3));*/


        //1.3
        /**
         * На массиве целых чисел произвести фильтрацию и удаление
         * Четных чисел, используя лямбда выражение
         */

        /*Filter<Integer> filter1 = o -> o%2 == 0;
        Integer[] integers1 = ArraysUtil.filter(integers, filter1);
        System.out.println(Arrays.toString(integers1));

        Function<Integer, Boolean> function = o -> o%2 == 0;
        Integer[] integers2 = ArraysUtil.filter(integers, function);
        System.out.println(Arrays.toString(integers2));*/

        /**
         * На массиве целых чисел произвести фильтрацию и удаление
         * Не являющимися числами Бернулли на заданном диапазоне, используя сложные лямбда выражения
         */

        /*BigDecimal[] decimals = new BigDecimal[]{new BigDecimal().valueOf(1.0), new BigDecimal("-0.50"), new BigDecimal("0.166666666666666650"),
                new BigDecimal("0"), new BigDecimal("-0.033333333333333350000"),
                new BigDecimal("0"), new BigDecimal("0.0238095238095238166666666666666662500000000000000000000"),
                new BigDecimal("0"),
                new BigDecimal("-0.03333333333333334666666666666666694444444444444425000000000000000000000000"),
                new BigDecimal("0"),
                new BigDecimal("0.07575757575757581666666666666668266666666666666827916666666666668125000000000000000000000000")};*/

        BigDecimal[] decimals2 = new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(-0.50), BigDecimal.valueOf(0.075757575759),
                BigDecimal.valueOf(0), BigDecimal.valueOf(10)};

        //1.4
        Filter<BigDecimal> filter3 = o -> {
            for (BigDecimal bigDecimal : bernuli(0, 10)) {
                if (Math.abs(o.subtract(bigDecimal).doubleValue()) < 0.000000000001)
                    return true;
            }
            return false;
        };
        BigDecimal[] decimals1 = ArraysUtil.filter(decimals2, filter3);
        System.out.println(Arrays.toString(decimals1));

        Function<BigDecimal, Boolean> function1 = o -> {
            for (BigDecimal bigDecimal : bernuli(0, 10)) {
                if (Math.abs(o.subtract(bigDecimal).doubleValue()) < 0.000000000001)
                    return true;
            }
            return false;
        };
        BigDecimal[] integers4 = ArraysUtil.filter(decimals2, function1);
        System.out.println(Arrays.toString(integers4));


        /**
         * На массиве строк произвести фильтрацию и оставить только те строки:
         */

        String[] strings = new String[]{"abc", "bca", "aBC", "bbb", "asd123", "asdf  dasd asd"};

        //2.1
        /**
         * Длина которых больше заданной с клавиатуры. Использовать ссылку на статический метод
         */


        //2.2
        /**
         * Символы, которых отсортированы лексикографически. Использовать сложные лямбда выражения
         */
/*
        Filter<String> filter = o -> {
            char[] mass = o.toCharArray();
            for (int i = 0; i < mass.length; i++) {
                for (int j = i+1; j < mass.length; j++) {
                    if (mass[i] > mass[j])
                        return false;
                }
            }
            return true;
        };
        String[] filter1 = ArraysUtil.filter(strings, filter);
        System.out.println(Arrays.toString(filter1));*/

        //2.3
        /**
         * Которые являются словами, используя ссылку на нестатический метод
         */

        /*StringFilter stringFilter = new StringFilter();
        Filter<String> filter2 = stringFilter::isWord;

        String[] strings1 = ArraysUtil.filter(strings, filter2);
        System.out.println(Arrays.toString(strings1));

        Function<String, Boolean> function = stringFilter::isWord;

        String[] strings2 = ArraysUtil.filter(strings, function);
        System.out.println(Arrays.toString(strings2));*/

        //Filter<Integer> filter2 = o -> o!=5;
        //Filter<Integer> filter3 = Program::f;


        // 3 На массиве произвольных объектов произвести фильтрацию и удаление, используя лямбда выражения
        //3.1
        /**
         * Всех ссылок равных null. Использовать метод Objects.nonNull
         */
        /*String[] strings1 = new String[]{"asd", "asd", "asd", null, null, "asd"};
        Filter<String> filter2 = Objects::nonNull;
        String[] strings2 = ArraysUtil.filter(strings1, filter2);
        System.out.println(Arrays.toString(strings2));

        Function<String, Boolean> function = Objects::nonNull;
        System.out.println(Arrays.toString(ArraysUtil.filter(strings1, function)));*/


        //3.2
        /**
         * Всех объектов, которые заполнены по умолчанию
         */

        /*Table[] tables = new Table[]{new Table(), new Table("asd", "asd", 45), new Table("qwe", "qwe", 50), new Table()};
        Filter<Table> filter = o -> !o.equals(new Table());
        Function<Table, Boolean> function =  o -> !o.equals(new Table());
        System.out.println(Arrays.toString(ArraysUtil.filter(tables, filter)));
        System.out.println(Arrays.toString(ArraysUtil.filter(tables, function)));*/



        // 4
        /*Detector[] detectors = new Detector[]{new Table(), new Table("asd", "asd", 45), new Chair("asd", "fdgh", 60), new Chair("asdfs", "asd", 49)};
        Filter<Detector> filter1 = Detector::detect;
        System.out.println(Arrays.toString(ArraysUtil.filter(detectors, filter1)));
        Function<Detector, Boolean> function1 = Detector::detect;
        System.out.println(Arrays.toString(ArraysUtil.filter(detectors, function1)));*/

        //System.out.println(factorial(0));

        System.out.println(bernuli(0, 10));

    }

    public static boolean f(Integer a){
        return a>0;
    }

    public static BigDecimal factorial(int a){
        BigDecimal b = new BigDecimal(1);
        for (int i = 2; i <= a; i++) {
            b = b.multiply(new BigDecimal(i));
        }
        return b;
    }

    public static ArrayList<BigDecimal> bernuli(int a, int b){
        ArrayList<BigDecimal> doubles = new ArrayList<>();
        ArrayList<BigDecimal> doubleBernulli = new ArrayList<>();
        doubles.add(BigDecimal.valueOf(1.00));
        if (a == 0)
            doubleBernulli.add(BigDecimal.valueOf(1.0));
        for (int n = 1; n <= b; n++) {
            BigDecimal d = new BigDecimal(0);
            for (int k = 1; k <= n; k++) {
                d = d.add(doubles.get(n-k).multiply(factorial(n+1)).divide(factorial(n+1 - k - 1).multiply(factorial(k+1))));
            }
            BigDecimal number = BigDecimal.valueOf(-1.0 / (n + 1)).multiply(d);
            doubles.add(number);
            if (n >=a)
                doubleBernulli.add(number);
        }
        return doubleBernulli;
    }
}
