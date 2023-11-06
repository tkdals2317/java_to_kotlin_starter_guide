package com.sangmin.lec12.kotlin

class Person(
    private val name: String,
    private val age: Int
) {

    //static 대신 companion object 사용
//    companion object {
//        // private val MIN_AGE = 0 // 런타임 시에 변수가 할당
//        private const val MIN_AGE = 0 // 컴파일 시에 변수가 할당된다. 진짜 상수에 붙이기 위한 용도(기본 타입과 String에 붙일 수 있음)
//        @JvmStatic
//        fun newBaby(name:String): Person {
//            return Person(name, MIN_AGE)
//        }
//    }

    companion object Factory: Log {
        private const val MIN_AGE = 1;
        fun newBaby(name:String): Person {
            return Person(name, MIN_AGE)
        }
        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory!")
        }
    }
}