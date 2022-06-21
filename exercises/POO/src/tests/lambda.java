package tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
interface MyNum {
    double getNum(double n);
}

@FunctionalInterface
interface Even {
    boolean par(int x);
}

public class lambda {
    public static void main(String[] args) {
        MyNum n1 = (x) -> x+1;
        // qualquer expressão que transforme double em double
        System.out.println(n1.getNum(10));
        n1 = (x) -> x*x;
        System.out.println(n1.getNum(10));
        Even n2 = (x) -> x % 2 == 0;
        System.out.println(n2.par(2));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(System.out::println);

        Stream<Integer> over6Elements = list.stream()
            .filter(p -> p > 6)
            .limit(10);
        
        System.out.println(over6Elements);

    }
}
