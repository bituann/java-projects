package bituan.bankingsystem;

public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private int acctNum;
    private double balance;
    private String password;

    public User(String firstName, String middleName, String lastName, double initialDeposit, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.password = password;
        this.balance = initialDeposit;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAccountName() {
        return "%s %s %s".formatted(this.firstName, this.middleName, this.lastName);
    }

    public int getAcctNum() {
        return acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAcctNum (int acctNum) {
        this.acctNum = acctNum;
    }

    public void setPassword (String password) {
        this.password = password;
    }
}
