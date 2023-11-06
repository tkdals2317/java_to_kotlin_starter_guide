package com.sangmin.lec11.kotlin

class Car(
    internal val name: String, // 한번에 getter, setter에 가시성 설정
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set // Setter에만 추가로 가시성을 부여
}