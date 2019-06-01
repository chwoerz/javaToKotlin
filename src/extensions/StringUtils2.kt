package extensions

// 1
fun String.prependHello(): String {
    return "Hello " + this
}

// 2
fun String.countNumbers(): Int {
    return count { it.isDigit() }
}

// 3
// Alt + Enter -> Convert to property
fun String.externalPartnerNr(): String {
    if (this.length != 10) {
        throw IllegalStateException("There is no way to create the external partnernr from this input")
    }
    return "0-${this.substring(0..2)}0${this.substring(3..4)}-${this.substring(5)}"
}

fun JavaLibrary.doubleText(): String {
    return this.text + this.text
}

fun main() {

}
