import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class User {
    private String name;
    private String mobileNumber;
    private String username;
    private String password;

    public User(String name, String mobileNumber, String username, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
