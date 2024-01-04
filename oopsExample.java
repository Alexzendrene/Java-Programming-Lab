
//  EXPERIMENT - 8 

//Write a Java Code to implement each of the following OOPs concepts: 
//Abstraction, Polymorphism, Encapsulation, Inheritance

// Abstraction - define an abstract class that provides a blueprint for other classes
abstract class Animal {
    // define abstract method that must be implemented by subclasses
    public abstract void makeSound();
}

// Polymorphism - define multiple classes that inherit from the same parent
// class
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

// Encapsulation - define a class with private data and public methods to access
// and modify that data
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Inheritance - define a class that inherits from another class
class Manager extends Employee {
    private int bonus;

    public Manager(String name, int age, int bonus) {
        super(name, age);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

public class oopsExample {
    public static void main(String[] args) {
        // Abstraction - create instances of Cat and Dog and call their makeSound()
        // methods
        Animal cat = new Cat();
        cat.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

        // Encapsulation - create an instance of Employee and set/get its name and age
        Employee employee = new Employee("Jitendra", 20);
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        employee.setName("Jitendra");
        employee.setAge(25);
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());

        // Inheritance - create an instance of Manager and set/get its name, age, and
        // bonus
        Manager manager = new Manager("Aashish ", 19, 10000);
        manager.setBonus(15000);
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Bonus: " + manager.getBonus());
    }
}
