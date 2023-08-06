package com.sangmin.lec10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 추상 프로퍼티가 아닌경우 프로퍼티를 오버라이드 할 때 무조건 open을 붙여줘야 한다.
) {
    abstract fun move();
}