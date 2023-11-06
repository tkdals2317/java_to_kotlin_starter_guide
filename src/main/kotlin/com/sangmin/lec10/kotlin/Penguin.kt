package com.sangmin.lec10.kotlin

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable { // 인터페이스 구현 역시 : 를 사용한다.

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 6

}