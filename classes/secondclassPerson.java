public class Person {
  String name;
  Integer age;
  String adress;
  String cpf;
  String rg;
  Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
  Person(String name, String cpf) {
    this.name = name;
    this.cpf = cpf;
  }
}

// =========================

class Main {
  public static void main(String[] args) {
    Person person1 = new Person(
      "João", 16
    );

    System.out.println(person1.name);
  }
}