package com.sangmin.lec03.java;

public class Lec03Main {
    public static void main(String[] args) {
        int number1 = 4;
        long number2 = number1; // 암시적 변경 가능
        System.out.println(number1 + number2);


        Person person = new Person("이상민", 28);
        String log = String.format("사람의 이름은 %s이고 나이는 %s세 입니다.", person.getName(), person.getAge());
        System.out.println(log);

        StringBuilder builder = new StringBuilder();
        builder.append("사람의 이름은");
        builder.append(person.getName());
        builder.append("이고 나이는");
        builder.append(person.getAge());
        builder.append("세 입니다.");
        System.out.println(builder.toString());

        String str = "ABCDE";
        char ch = str.charAt(1);

    }


    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }

}
