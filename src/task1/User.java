package task1;

public class User {
    private String login;
    private String mail;
    private String pass;
    private int age;

    public User(String login, String mail, String pass, int age) {
        this.login = login;
        this.mail = mail;
        this.pass = pass;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public int getAge() {
        return age;
    }
}