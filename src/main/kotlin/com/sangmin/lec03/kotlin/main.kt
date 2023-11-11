package com.sangmin.lec03.kotlin

import com.sangmin.lec03.java.Person

fun main() {
    val number1 = 4
    //val number2 : Long = number1 // Type Mismatch
    val number2 : Long = number1.toLong()

    val number3 = 3
    val number4 = 5
    val result = number3 / number4.toDouble()
    println(result)

    val number5 :Int? = 3
    val number6 : Long = number5?.toLong() ?: 0L
    val person = Person("이상민", 15)
    printAgeIfPerson(person)

    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."

    val name = "이상민"
    val age = 28
    val log2 = "사람의 이름: $name 나이: $age"


    val withoutIndent =
        """
            ABC
            123
            456
        """
    println(withoutIndent)
    println(withoutIndent.trimIndent())

    val str = "ABCDE"
    val ch = str[1]

}

fun printAgeIfPerson(obj : Any?) {
    if (obj is Person) { // is : Java의 instanceof
        val person = obj as Person // Java의 (Person) obj
        println(person.age)
    }

    if (obj is Person) {
        println(obj.age) // (타입변환 생략가능)
    }
    // Person이 아니라면
    if (obj !is Person) {
        
    }

//    // value가 Type이면 Type으로 캐스팅, value가 Type이 아니면 예외발생
//    val person = obj as Person

    // value가 Type이면 Type으로 캐스팅, value가 Type이 아니거나 null이면 null로 반환
    val person = obj as? Person
    println(person?.age) // person null인 경우를 대비하여 safey call

}
