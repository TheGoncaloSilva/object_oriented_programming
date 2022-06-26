package tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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


        System.out.println(
            list.stream()
                .filter(val -> val >= 7)
                .collect(Collectors.toList())
        );

        System.out.println(list.stream().filter(val -> val >= 1).collect(Collectors.toList()).stream().filter(val -> val >= 2)
            .collect(Collectors.toList()).stream().filter(val -> val >= 3).collect(Collectors.toList()).stream().filter(val -> val >= 4)
            .collect(Collectors.toList()).stream().filter(val -> val >= 5).collect(Collectors.toList())
            .stream().filter(val -> val >= 6).collect(Collectors.toList()).stream().filter(val -> val >= 7).collect(Collectors.toList()));

        /*var sortedList = list.toStream()
            .sorted(Comparator.comparing(person.name))
            .collect(Collectors.toList());*/

        Map<String, Integer> nameBillions = new LinkedHashMap<>();

        nameBillions.put("Warren Buffet", 120);
        nameBillions.put("Jeff Bezos", 150);
        nameBillions.put("Bill Gates", 100);
        nameBillions.put("Mark Zuckerberg", 50);

        /*for(Map.Entry<String, HashMap> entry : selects.entrySet()) {
            String key = entry.getKey();
            HashMap value = entry.getValue();
        
            // do what you have to do here
            // In your case, another loop.
        }*/
        System.out.println("\nListar Todos");
        nameBillions.forEach((key, value) -> System.out.println("Key: " + key + "; Value: " + value));
        
        System.out.println("\nListar todos com net com net worth acima de 110 bilioes");
        Map<String, Integer> above11 = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> person: nameBillions.entrySet()){
            if(person.getValue() >= 110)
                above11.put(person.getKey(), person.getValue());
        }
        above11.forEach((k, v) -> System.out.println("Name: " + k + "; Value: " + v));


    }
}
