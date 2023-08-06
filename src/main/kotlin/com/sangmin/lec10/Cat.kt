package com.sangmin.lec10

class Cat(
    species: String
) : Animal(species, 4) { // extends 키워드 대신 : 를 사용한다, 상위 클래스의 생성자를 바로 호출해야 함

    override fun move() { // overide 지시어 사용
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}