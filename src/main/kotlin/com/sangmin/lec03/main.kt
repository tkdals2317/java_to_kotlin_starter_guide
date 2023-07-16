package com.sangmin.lec03

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
    printAgeIfPerson(Person(15))
}

fun printAgeIfPerson(obj : Any?) {
    if (obj is Person) {
        val person = obj as Person // 타입변환 생략가능
        println(person.age)
    }

    if (obj is Person) {
        println(obj.age)
    }
    // Person이 아니라면
    if (obj !is Person) {
        
    }

    val person = obj as? Person
    println(person?.age) // person null인 경우를 대비하여 safey call

}
