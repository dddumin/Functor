package util;

import model.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

public class ArraysUtil {
    public static <T> T[] filter(T[] ts, Filter<T> filter){
        int count = 0;
        //T[] cloneMass = ts.clone();
        T[] cloneMass = Arrays.copyOf(ts, ts.length);
        for (T value : ts) {
            if (filter.apply(value)){
                cloneMass[count] = value;
                count++;
            }
        }
        return Arrays.copyOf(cloneMass, count);
    }

    public static  <T> T[] filter(T[] ts, Function<? super T, Boolean> function){
        int count = 0;
        T[] cloneMass = ts.clone();
        for (T value: ts) {
            if (function.apply(value)){
                cloneMass[count] = value;
                count++;
            }
        }
        return Arrays.copyOf(cloneMass, count);
    }
}
