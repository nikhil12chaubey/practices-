public class crazy {
    public static void main(String[] args) {
        Child1 person1 = new Child1("Alice", 101, 20);
        Child2 person2 = new Child2("Bob", 102, 22);

        System.out.println("Person 1 details:");
        person1.display();

        System.out.println("\nPerson 2 details:");
        person2.display();
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

class Child1 extends Person {
    Child1(String name, int rollNo, int age) {
        super(name, rollNo, age);
    }
}

class Child2 extends Person {
    Child2(String name, int rollNo, int age) {
        super(name, rollNo, age);
    }
}
