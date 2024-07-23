import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class UserBO {
    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws IOException {
        for (User user : userList) {
            bw.write(user.getName() + "," + user.getMobileNumber() + "," + user.getUsername() + "," + user.getPassword());
            bw.newLine();
        }
    }
}
