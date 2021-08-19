package model;

import java.util.function.Function;

public class PositiveNumberFunction implements Function<Integer, Boolean> {
    @Override
    public Boolean apply(Integer integer) {
        return integer > 0;
    }
}
