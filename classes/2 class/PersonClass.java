import java.util.*;

class PersonClass {
  public static void main(String[] args) {
    // Person[] people = new Person[3];
    // for (int i = 0; i < people.length; i++) {
    //   people[i] = new Person();
    // }
    
    Person person1 = new Person();
    person1.name = "John";
    person1.age = 30;

    System.out.println(person1.name);
  }
}