package com.sangmin.lec04;

public class Lec04Main {
    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = money1;
        JavaMoney money3 = new JavaMoney(1_000L);

        System.out.println(money1 == money2);
        System.out.println(money1 == money3);
        System.out.println(money1.equals(money3));

        if(money1.compareTo(money3) > 0) {
            System.out.println("Money1이 Money2보다 금액이 큽니다.");
        }

        JavaMoney money4 = new JavaMoney(1_000L);
        JavaMoney money5 = new JavaMoney(2_000L);
        System.out.println(money4.plus(money5));
    }
}
