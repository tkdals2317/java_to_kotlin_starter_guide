package com.sangmin.lec10.kotlin

interface Flyable {

    // default 키워드를 쓰지 않아도 default 메서드를 구현할 수 있다.
    fun act() {
        println("파닥 파닥")
    }
}