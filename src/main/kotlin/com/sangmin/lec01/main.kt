package com.sangmin.lec01

fun main() {
    // variable의 약자(가변)
    var number1 : Long = 10L
    number1 = 12L // 변경 가능

    var number : Int
    // println(number) // 초기화하지 않으면 값을 사용할 수 없다(타입추론이 불가능)

    // value의 약자(불변)
    val number2 = 10L
    // number2 = 12L // 변경 불가능

    var number3 : Long? = 1000L // 코틀린에서는 primitive 타입과 reference 타입을 구분하지 않는다. (코틀린이 알아서 내부적으로 프리미티브 타입으로 변경)
    number3 = null;

    // 객체를 인스턴스화 할 때 new 키워드 사용하지 않음
    var person = Person("이상민")
}