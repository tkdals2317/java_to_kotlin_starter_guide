package com.sangmin.lec06;

import java.util.Arrays;
import java.util.List;

public class Lec06Main {

    public void printForEach() {
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for (Long number : numbers) {
            System.out.println(number);
        }
    }

    public void printFor() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }


    public void printWhile() {
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
    }
}
