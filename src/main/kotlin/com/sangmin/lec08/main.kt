package com.sangmin.lec08

fun main() {
}

// 함수 선언 문법
public fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun maxV2(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}


// 함수가 하나의 결과 값이면 block 대신 = 사용가능
fun maxV3(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

// 한 줄로 변경가능
fun maxV4(a: Int, b: Int): Int = if (a > b) a else b

// = 을 사용하는 경우 반환 타입 생략 가능
fun maxV5(a: Int, b: Int) = if (a > b) a else b

