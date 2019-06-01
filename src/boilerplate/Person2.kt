package boilerplate2

// equals, hashcode, toString, copy
data class Person(val firstName: String, var lastName: String, var age: Int)

fun main() {
    println(Person("Christian", "Wörz", 24))
    val p1 = Person("Christian", "Wörz", 24)
    val p2 = p1.copy()
    println(p1 == p2) // true
    println(p1 === p2) // false
    val p3 = p1.copy(age = 25)
    println(p1 == p3) // false
    println(p1 === p3) // false
}
