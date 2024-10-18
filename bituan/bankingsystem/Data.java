package bituan.bankingsystem;

import java.io.IOException;
import java.io.PrintWriter;

public class Data {
    public void save (User user) {

        try (PrintWriter writer = new PrintWriter("database.txt")) {
            writer.print(user.getFirstName() + ",");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
