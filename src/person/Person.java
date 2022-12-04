package person;

import java.util.UUID;

public class Person extends Object {
    private final String personNumber = UUID.randomUUID().toString();

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getPersonNumber() {
        return personNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }

        this.age = age;
    }
}
