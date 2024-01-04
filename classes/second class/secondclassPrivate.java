public class Person {
  private String login;
  private String password;

  public String getLogin() {
    return this.login;
  }
  public void setLogin(String value) {
    this.login = value;
  }

  public String getPassword() {
    return this.password;
  }
  public void setPassword(String value) {
    this.password = value;
  }
}

// ====================

class Main {
  public static void main(String[] args) {
    Person person = new Person();

    person.setLogin("login");
    person.setPassword("password");

    System.out.println("Login: " + person.getLogin());
    System.out.println("Password: " + person.getPassword());
  }
}