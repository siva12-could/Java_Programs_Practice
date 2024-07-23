import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class UserBO {
    public List<User> readFromFile(BufferedReader br) throws IOException {
        List<User> userList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            User user = new User(data[0], data[1], data[2], data[3]);
            userList.add(user);
        }
        return userList;
    }

    public void display(List<User> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.printf("%-15s %-20s %-15s %s\n", "Name", "Email", "Username", "Password");
            for (User user : list) {
                System.out.printf("%-15s %-20s %-15s %s\n", user.getName(), user.getEmail(), user.getUsername(), user.getPassword());
            }
        }
    }
}
