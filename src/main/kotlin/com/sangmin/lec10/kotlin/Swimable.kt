package com.sangmin.lec10.kotlin

interface Swimable {

    // backing filed 없는 프로퍼티를 인터페이스 만들 수 있다.
    val swimAbility: Int
        get() = 3 // 직접 default 값을 설정해줄 수 있다.

    fun act() { // 코틀린의 인터페이스는 default 키워드 없이 default 메서드를 구현할 수 있다.
        println(swimAbility) // 구현한 클래스에서 구현해줄 거라 믿는다.
        println("어푸 어푸")
    }
}