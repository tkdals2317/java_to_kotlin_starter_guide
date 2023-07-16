package com.sangmin.lec02

fun main() {
    // Safe Call : null이 아니면 실행하고, null이면 실행하지 않는다 (그대로 null)
    val str: String? = null
    //println(str.length) // 불가능
    println(str?.length)  // 가능(Safe Call) null이 아니면 실행시키고 아니면 그대로 null
    println(str?.length ?: 0)  // Elvis 연산자로 null일 때 대체할 값을 지정 가능하다

    println(startWith("ABC"))
    println(startWith("BC"))
    //println(startWith(null)) // NPE 발생!

    val person = Person("공부하는 이상민")
    startWithA(person.name) // @Nullable이 붙어있어서 에러가 난다. @NotNull 어노테이션이 붙어있으면 정상 동작

    val person2 = Person(null)
    startWithA(person2.name) // 아무런 애노테이션이 붙어있지 않으면 런타임에 에러가 난다.(플랫폼 타입)
}

fun startWithA(str: String): Boolean {
    // null이 아닌 타입은 바로 메서드 호출이 가능하다
    return str.startsWith("A")
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다")
//    }
//    return str.startsWith("A")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

fun startWithA23(str: String?): Boolean {
    return str?.startsWith("A") ?: false
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

// Elvis 연산을 통한 early return
fun calculate(number: Long?): Long {
    return number ?: return 0
    // 다음 로직
}

// null 아님을 단언하는 !! 연산자
// 혹시나 null이 들어오면 NPE가 나오기 때문에 정말 null이 아닌게 확실한 경우에만 널 아님 단언!!을 사용해야 함
fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}