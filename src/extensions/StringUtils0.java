package extensions;

public final class StringUtils0 {

    // 1
    public static String prependHello(String string) {
        return "Hello " + string;
    }

    // 2
    public static long countNumbers(String string) {
        return string
                .chars()
                .filter(Character::isDigit)
                .count();
    }

    // 3
    public static String toExternalPartnerNr(String partnerNr) {
        return "0-" + partnerNr.substring(0, 2) + "0" + partnerNr.substring(3) + "-" + partnerNr.substring(4);
    }
}
