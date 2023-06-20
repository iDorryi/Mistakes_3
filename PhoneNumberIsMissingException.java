package Task_3;
public class PhoneNumberIsMissingException extends Exception {
    public PhoneNumberIsMissingException() {
        super("Номер телефона не найден !");
    }
}