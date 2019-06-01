package extensions

// 1
fun String.prependHello(): String {
    return "Hello $this"
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
    return "0-${this.substring(0..1)}0${this[2]}-${this.substring(3)}"
}

fun String?.nullToString(): String {
    return if (this.isNullOrBlank()) "null" else this
}

fun JavaLibrary.doubleText(): String {
    return "$text $text"
}

fun main() {
    println("Techtalk".prependHello()) // "Hello Techtalk
    println("1a2b3c".countNumbers()) // 3
    println("0123456789".externalPartnerNr()) // 0-0102-3456789
    var s: String? = null
    println(s.nullToString()) // "null"
    s = "Hi Techtalk"
    println(s.nullToString()) // "Techtalk"
    val javaLibrary = JavaLibrary("text")
    println(javaLibrary.doubleText()) // "text text"
}
