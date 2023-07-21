package com.sangmin.lec06

fun main() {
}

// 향상된 for문
fun printForEach() {
    val numbers = listOf(1L, 2L, 3L) // 컬렉션을 만드는 방법
    for (number in numbers) { // : 대신 in을 사용
        println(number)
    }
}

// 전통적인 for문
fun printFor() {
    for(i in 1..3) {
        println(i)
    }
}

// 전통적인 for문(역순)
fun printForReverse() {
    for (i in 3 downTo 1) {
        println(i)
    }
}

// 전통적인 for문(2개씩 증가)
fun printForStep2() {
    for(i in 1..5 step 2) {
        println(i)
    }
}

// while문
fun printWhile() {
    var i = 1;
    while (i <= 3) {
        println(i)
        i++
    }
}




