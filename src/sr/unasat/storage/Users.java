package sr.unasat.storage;

public class Users {

    private String firstName;
    private String lastName;
    private double balance;
    private int pincode;

    public Users(String firstName, String lastName, double balance, int pincode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.pincode = pincode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
