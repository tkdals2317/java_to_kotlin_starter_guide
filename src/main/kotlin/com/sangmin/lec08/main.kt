package com.sangmin.lec08

fun main() {
    callRepeat()
    // 파라미터 시그니처가 겹치면 이런 실수가 발생한다.
    printNameAndGender("FEMALE", "이상민")
    // named argument 장점 : builder를 직접 만들지 않고 builder의 장점을 가지게 된다.
    printNameAndGender(name = "이상민", gender = "FEMALE")
}

/* 1. 함수 선언 문법 */
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


/* 2. default parameter */
// 코틀린에서는 디폴트 파라미터를 설정할 수 있다.
// 밖에서 파라미터를 넣어주지 않으면 기본값을 사용하자
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// repeat을 호출할 때 num은 3을 그대로 쓰고, useNewLine은 false를 쓰고 싶다면?
/* 3. named argument */
fun callRepeat() {
    // 매개변수 이름을 통해 직접 지정, 지정되지 않은 매개변수는 기본값을 사용
    repeat("Hello World", 5, true)
    repeat("default parameter")
    repeat("name argument", useNewLine = false)
}

/* 4. 같은 타입의 여러 파라미터 받기(가변인자) */
fun printAll(vararg strings: String) { // ...을 타입 뒤에 쓰는 대신 제일 앞에 vararg를 적어주어야한다.
    for (str in strings) {
        println(str)
    }
}

fun callPrintAll() {
    val array = arrayOf("A", "B", "C")
    // 배열을 바로 넣는 대신 스프레드 연산자(*)를 붙여주어야 한다.
    printAll(*array)
    printAll("A", "B", "C")
}


fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}