package com.sangmin.lec09

fun main() {
    val person1 = Person("이상민", 28)
    println(person1.name)
    person1.age = 10
    println(person1.age)

    val javaPerson = JavaPerson("이상순", 20)
    println(javaPerson.name)
    javaPerson.age = 15
    println(javaPerson.age)

    val person2 = Person("최태현")
    val person3 = Person()
}

// 주 생성자
// constructor 생략 가능
// 프로퍼티 = 필드 + getter + setter
// 클래스의 필드 선언과 생성자를 동시에 선언할 수 있다.
// .필드를 통해 getter와 setter를 호출 할 수 있다.
class Person(
    name: String = "이상민", var age: Int = 1
) {
    // 커스텀 Getter 생성 시 유의사항
    //val name = name
    //    get() = field.uppercase() // filed는 backing filed로 무한루프를 방지하기 위한 예약어, 자기 자신을 가리킨다.
    // custom getter에서 backing field를 쓰는 경우가 드물다.
    // 아래와 같이 사용하면 됨
    fun getUppercaseName(): String {
        return this.name.uppercase()
    }

    val uppercaseName: String get() = this.name.uppercase()


    var name = name
        set(value) {
            field = value.uppercase()
        }

    // 클래스가 초기화되는 시점에 호출되는 블록 : init
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    // 부생성자 추가 가능
    constructor(name: String) : this(name, 1) {
        println("첫 번째 부생성자")
    }


    constructor() : this("홍길동") {
        println("두 번째 부생성자")
    }

    // 코틀린에서는 부생성자보다는 default parameter 방식을 권장한다.
    // 만약 사용해야한다면 정적 팩터리 메서드를 사용하자

    // 함수로 만든 경우
    fun isAdultV1(): Boolean {
        return this.age >= 20
    }

    // 프로퍼티로 만든 경우(Custom getter)
    val isAdultV2: Boolean
        get() = this.age >= 20

    val isAdultV3: Boolean
        get() {
            return this.age >= 20
        }

    /*
    그렇다면 위 세개 중 어떤 걸 쓰는 게 좋을까?
    객체의 속성을 나타내는 것이라면, custom getter를 사용하고
    그렇지 않다면 함수를 사용하자
    위 isAdult의 경우
    이 사람이 성인인가라는 속성을 확인하는 것 처럼 보이므로 custom getter 방식을 사용한다
    */

}