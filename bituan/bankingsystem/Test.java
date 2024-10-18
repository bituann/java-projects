package bituan.bankingsystem;

public class Test {
    public static void main (String[] args) {
        User user = new User("Tobi", "N", "Awanebi", 10000, "Hi");

        System.out.println(user.getBalance());
    }
}
