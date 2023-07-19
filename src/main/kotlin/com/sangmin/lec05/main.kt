package com.sangmin.lec05

fun main() {
}

// 1. if문의 Java의 문법과 차이가 없다.
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}


// 2. 코틀린에서 if-else는 식(Expression)이므로 그 자체로 반환이 가능하다. (Java의 3항연산자와 비슷하다 => 코틀린에서는 3항연산자가 없다.)
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

// if-elseif-else도 마찬가지이다.
fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun validateScoreRange(score: Int) {
    // if (!(0 <= score && score <= 100))
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100입니다")
    }
}

// 코틀린은 switch 대신 when 문이 있다
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "0"
    }
}

fun getGradeWithSwitchV2(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..90 -> "B"
        in 70..80 -> "C"
        else -> "0"
    }
}


// when 절의 조건부는 어떠한 expression이 들어갈 수 있다.
fun startWithA(obj : Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// 여러개의 조건을 사용할 수 있다.
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

// 값 자체가 없을 수도 있다. 자바의 switch문보다 유연하다.
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}