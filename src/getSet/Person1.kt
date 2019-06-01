package getSet1

// equals, hashcode, toString, copy
data class Person(val firstName: String, var lastName: String, var age: Int) {
    private var fullNameAccess: Int = 0

    val fullName: String
        get() {
            fullNameAccess++
            return "$firstName $lastName"
        }
}

fun main() {
    val p1 = Person("Christian", "Wörz", 24)
    // fullNameAccess => 0
    p1.fullName
    // fullNameAccess => 1

}
