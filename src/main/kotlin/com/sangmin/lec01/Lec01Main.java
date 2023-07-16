package com.sangmin.lec01;

import java.util.Arrays;
import java.util.List;

public class Lec01Main {
    public static void main(String[] args) {
        long number1 = 10L; // (1)
        final long number2 = 10L; // (2)

        // 위 둘의 차이 가변과 불변의 차이


        Long number3 = 1_000L; // (3)
        Person person = new Person("이상민"); //

        final List<Integer> numbers = Arrays.asList(1, 2);
        numbers.add(3);
    }
}
