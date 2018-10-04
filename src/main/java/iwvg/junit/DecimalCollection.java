package iwvg.junit;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    private static final String EMPTY_COLLECTION = "Empty collection";

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        return this.collection.stream().mapToDouble(Double::doubleValue).sum();

    }

    public double multiply() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        double result = 1;
        for (double item : this.collection){
            result = result*item;
        }
        return result;

    }

    public double higher() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }

}
