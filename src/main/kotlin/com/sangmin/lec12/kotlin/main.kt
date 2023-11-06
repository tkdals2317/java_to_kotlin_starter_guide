package com.sangmin.lec12.kotlin

import com.sangmin.lec12.java.Movable

fun main() {

    // 이름이 없는 경우
    //val newBaby = Person.Companion.newBaby("상문")

    // @JvmStatic
    //val newBaby1 = Person.newBaby("상민")

    // 이름이 있는 경우
    val newBaby2 = Person.Factory.newBaby("상만")

    moveSomething(object : Movable{
        override fun move() {
            println("코틀코틀 움직인다.")
        }

        override fun fly() {
            println("코틀코틀 난다.")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}