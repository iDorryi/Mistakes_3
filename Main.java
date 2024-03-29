package Task_3;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.nio.file.StandardOpenOption;
// import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] string = View.addString();
        if (Program.checking_the_size(Program.number_of_elements(string))){
            try {
                int name = Program.name_search(string);
                int date = Program.date_search(string);
                int phone = Program.phone_number_search(string);
                int gender = Program.gender_search(string);
                Logger.writer(string, name, date, phone, gender);
            } catch (NameIsMissingException | DateIsMissingException | PhoneNumberIsMissingException
                    | GenderIsMissingException | IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}