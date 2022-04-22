import Part1.Person;
import Part3.Circle;
import Part3.Figure;
import Part3.Square;
import Part3.Triangle;

public class Main {
    public static void main(String[] args) {

        // Part 1

        Person person1 = new Person.PersonBuilder().setFirstName("Лев").setLastName("Железный").setMiddleName("Сергеевич").build();
        System.out.println(person1);
        Person person2 = new Person.PersonBuilder().setFirstName("Лира")
                .setLastName("Волнистая")
                .setMiddleName("Денисовна")
                .setGender("F")
                .setCountry("Russian")
                .setAge(24)
                .setPhone("+7-999-123-45-67")
                .setAddress("ヽ(　￣д￣)ノ").build();
        System.out.println(person2);
        Person person3 = new Person.PersonBuilder().setFirstName("Лев").setLastName("Железный").build();
        System.out.println(person3);

        // Part 3

        Figure[] figures = new Figure [5];
        figures[0]= new Circle(2);
        figures[1]= new Square(2);
        figures[2]= new Triangle(3,4,5);
        figures[3]= new Circle(8);
        figures[4]= new Triangle(6,7, 8);

        for (Figure figure : figures) {
            figure.printArea();
        }

    }
}