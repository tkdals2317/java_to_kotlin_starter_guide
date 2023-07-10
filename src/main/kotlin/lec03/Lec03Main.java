package lec03;

public class Lec03Main {
    public static void main(String[] args) {
        int number1 = 4;
        long number2 = number1; // 암시적 변경 가능
        System.out.println(number1 + number2);
    }


    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }

}
