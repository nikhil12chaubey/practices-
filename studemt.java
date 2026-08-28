public class studemt {
    public static void main(String[] args) {
        Person person1 = new Person("Person1", 101, 20);
        Child child1 = new Child("Child1", 201, 5, person1);

        Person person2 = new Person("Person2", 102, 22);
        Child child2 = new Child("Child2", 202, 6, person2);

        System.out.println("Person 1 details:");
        person1.display();

        System.out.println("\nChild 1 details:");
        child1.display();

        System.out.println("\nPerson 2 details:");
        person2.display();

        System.out.println("\nChild 2 details:");
        child2.display();
    }
}

class Person {
    String name;
    int rollNo;
    int age;

    Person(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
    }
}

class Child extends Person {
    String parentName;

    Child(String name, int rollNo, int age, Person parent) {
        super(name, rollNo, age);
        this.parentName = parent.name;
    }

    @Override
    void display() {
        System.out.println("Child Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Parent: " + parentName);
    }
}