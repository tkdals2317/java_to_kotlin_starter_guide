package com.sangmin.lec08;

public class Lec08Main {

    /* 1. 함수 선언 문법 */
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    /* 2. default parameter */
    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    // 많은 코드에서 useNewline을 true로 사용한다면? Java의 오버로딩을 활용
    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    // 많은 코드에서 출력을 3회씩 하고 있다면? 다시 한번 오버로딩! 총 3개의 함수가 존재
    public void repeat(String str) {
        repeat(str, 3, true);
    }


    /* 4. 같은 타입의 여러 파라미터 받기(가변인자) */
    public static void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        // 배열을 직접 넣거나, comma를 이용해 여러 파라미터를 넣는다.
        printAll(array);
        printAll("A", "B", "C");
    }

}
