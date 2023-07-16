package com.sangmin.lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)


    // Java와 다르게 객체를 비교할 때 비교 연산자를 사용하면 자동으로 compareTo를 호출해준다.
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)


    // 동일성 비교(객체의 주소 비교)는 ===를 사용한다
    println(money3 === money4)
    println(money3 === money5)
    // 동등성 비교(값 비교)에는 ==를 사용한다
    println(money3 == money5)

    // lazy 연산을 통해 fun 2를 실행하지 않고 바로 본문을 실행한다.
    if (fun1() || fun2()) {
        println("본문")
    }

    if (fun2() && fun1()) {
        println("본문")
    }

    // 코틀린에서는 객체 별로 연산자를 적용할 수 있다.
    val kotMoney1 = Money(1_000L)
    val kotMoney2 = Money(2_000L)

    println(kotMoney1 + kotMoney2)

}

fun fun1() : Boolean {
    println("fun 1")
    return true
}

fun fun2() : Boolean {
    println("fun 2")
    return false
}