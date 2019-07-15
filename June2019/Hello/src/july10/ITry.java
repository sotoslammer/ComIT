package july10;

import july10.work.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ITry {
    public static void main(String[] args) {
//        int result = divide(1, 0);
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(15);
        numbers.size();
//        numbers.remove(0);
        System.out.println(numbers);
        Set<Integer> numSet = new HashSet<Integer>();
        numSet.add(10);
        numSet.add(10);
        numSet.add(15);
        System.out.println(numSet);
    }

    public static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch(Exception e) {
            throw new IllegalArgumentException("divide by zero, No bueno");
        }
    }
}
