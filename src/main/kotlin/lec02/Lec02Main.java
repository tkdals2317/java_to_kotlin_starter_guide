package lec02;

public class Lec02Main {
    public static void main(String[] args) {

    }

    // str에 null이 들어오면 NPE 발생
    public boolean startsWithA(String str) {
        return str.startsWith("A");
    }

    public boolean startsWithA1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null이 들어왔습니다");
        }
        return str.startsWith("A");
    }

    public Boolean startsWithA2(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("A");
    }

    public boolean startsWithA3(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("A");
    }
    
    public long calculate(Long number) {
        if(number == null) {
            return 0;
        }
        // 다음 로직
        return number;
    }
}
