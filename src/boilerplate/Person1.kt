package boilerplate1

import java.util.Objects

// Probleme:
// 1. Neue properties
// 2. toString/copy
class Person(val firstName: String, var lastName: String?, var name: Int) {

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val person = o as Person?
        return name == person!!.name &&
                firstName == person.firstName &&
                lastName == person.lastName
    }

    override fun hashCode(): Int {
        return Objects.hash(firstName, lastName, name)
    }
}
