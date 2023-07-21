package com.sangmin.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    readFile()
    readFileV2("./a.txt")
}

// try catch finally 구문 : 문법적으로 동일하다
fun parsIntOrThrow(str: String) : Int {
    try {
        return str.toInt() // 기본타입간의 형변환은 toType()을 사용
    } catch (e : NumberFormatException) { // 타입이 뒤에 옴
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다") // new 를 사용하지 않음
    }
}

// try catch 구문 역시 expression 이다
fun parseIntOrNull(str: String) : Int? {
    return try {
        str.toInt()
    } catch (e : NumberFormatException) {
        null
    }
}

//Checked Exception 과 Uchecked Exception 을 구분하지 않고 모두 Unchecked Exception 이므로 throw 구문이 없다.
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// 코틀린은 try with resources 구문 대신 use라는 inline 확장 함수를 사용한다.
// 대신 코틀린의 언어적 특징을 활용해 close를 호출해준다.
fun readFileV2(path : String) {
    BufferedReader(FileReader(path)).use {reader ->
        println(reader.readLine())
    }
}
