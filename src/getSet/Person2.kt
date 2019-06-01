package getSet2

// equals, hashcode, toString, copy
data class Person(val firstName: String, var lastName: String, var age: Int) {
    var fullNameAccess: Int = 0
        // Update nur intern möglich
        private set(value) {
            println("fullNameAccess updated")
            field = value
        }

    val fullName: String
        get() {
            fullNameAccess++
            return "$firstName $lastName"
        }

}

fun main() {
    val p1 = Person("Christian", "Wörz", 24)
    var fullNameAccess = p1.fullNameAccess
    println(fullNameAccess) // 0
    val fullName = p1.fullName
    fullNameAccess = p1.fullNameAccess // => "fullNameAccess updated"
    println(fullNameAccess) // 1
}
