package Part1;

import java.util.Objects;

public class Person {

    final private String firstName;
    final private String lastName;
    final private String middleName;
    final private String country;
    final private String address;
    final private String phone;
    final private int age;
    final private String gender;

    public Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.middleName = personBuilder.middleName;
        this.country = personBuilder.country;
        this.address = personBuilder.address;
        this.phone = personBuilder.phone;
        this.age = personBuilder.age;
        this.gender = personBuilder.gender;
    }

    public static class PersonBuilder {
        protected String firstName;
        protected String lastName;
        protected String middleName;
        protected String country;
        protected String address;
        protected String phone;
        protected int age;
        protected String gender;

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            Person person = null;
            if (validCustomer()) {
                person = new Person(this);
            } else {
                System.err.println("Required fields to be filled");
            }
            return person;
        }

        private boolean validCustomer() {
            return (Objects.nonNull(firstName) && !firstName.isBlank()
                    && Objects.nonNull(lastName) && !lastName.isBlank()
                    && Objects.nonNull(middleName) && !middleName.isBlank());
        }
    }

    @Override
    public String toString() {
        return "Part1.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
