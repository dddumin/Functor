package model;

public class PositiveNumberFilter implements Filter<Integer> {
    @Override
    public boolean apply(Integer integer) {
        return integer > 0;
    }
}
