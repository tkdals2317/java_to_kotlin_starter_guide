package com.sangmin.lec10

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number) // 하위 클래스의 number를 가져오는데 아직 생성자가 호출되지 않아 Int 기본 값인 0이 출력된다.
        /**
         * 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다.
         */
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}

fun main() {
    val derived = Derived(300)
}