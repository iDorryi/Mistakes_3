package Task_3;
public class NameIsMissingException extends Exception {
    public NameIsMissingException() {
        super("ФИО не найдено !");
    }
}