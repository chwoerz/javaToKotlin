package extensions;

public class Main {

    public static void main(String[] args) {
        String partnerNr = "0123456789";
        long numbersInString = StringUtils0.countNumbers(partnerNr);
        String helloWorld = StringUtils0.prependHello("World");
        String externalPartnerNr = StringUtils0.toExternalPartnerNr(partnerNr);
    }
}
