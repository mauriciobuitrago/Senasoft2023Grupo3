package models;

//Class to capture data with get and setter
public class RegisterData {
    //Data
    private String email;
    private String password;

    //methods get and setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}