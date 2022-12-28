package carBookingSystemCLI.user;

import carBookingSystemCLI.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class user {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private Address address;
    private Car[] car;

    public user(String firstName,
                String lastName,
                Gender gender,
                int age,
                Address address,
                Car[] car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.car = car;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCar() {
        return car;
    }

    public void setCar(Car[] car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "user{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address=" + address +
                ", car=" + Arrays.toString(car) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && gender == user.gender && Objects.equals(address, user.address) && Arrays.equals(car, user.car);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender, age, address);
        result = 31 * result + Arrays.hashCode(car);
        return result;
    }
}
