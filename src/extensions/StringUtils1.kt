package extensions

class StringUtilsJavaLike {

    companion object {
        // 1
        fun prependHello(string: String): String {
            return "Hello $string"
        }

        // 2
        fun countNumbers(string: String): Long {
            return string
                .chars()
                .filter { Character.isDigit(it) }
                .count()
        }

        // 3
        fun toExternalPartnerNr(partnerNr: String): String {
            if (partnerNr.length != 10) {
                throw IllegalStateException("There is no way to create the external partnernr from this input")
            }
            return "0-" + partnerNr.substring(0, 2) + "0" + partnerNr.substring(3) + "-" + partnerNr.substring(4)
        }
    }

}
