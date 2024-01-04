public class Person {
  private String login;
  private String password;
  private Integer age;

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

  public Integer getAge() {
    return this.age;
  }
  public void setAge(Integer value) {
    this.age = value;
  }
  public void addAge(Integer value) {
    this.age += value;
  }
}

// =====================

import java.util.*;

class SetAndGet {
  public static void main(String[] args) {
    Person person = new Person();

    person.setLogin("login");
    person.setPassword("password");
    person.setAge(21);

    System.out.println("Login: " + person.getLogin());
    System.out.println("Password: " + person.getPassword());

    person.addAge(1);

    System.out.println("Age: " + person.getAge());
  }
}