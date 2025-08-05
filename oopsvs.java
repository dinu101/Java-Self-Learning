public class oopsvs {
    // This is our main class to run the program

    public static void main(String[] args) {
        // Object creation (Class/Object concept)
        Car myCar = new Car("Honda", "Civic", 2023);
        myCar.startEngine(); // Polymorphism - overridden method
        myCar.showDetails(); // Encapsulation - accessing through method
    }
}

// 👨‍🏫 Abstraction - Abstract class hides internal implementation and forces subclasses to implement required behavior
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor - to initialize vehicle properties
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Abstract method - must be implemented by subclasses
    abstract void startEngine();

    // Encapsulation - Data accessed through getter method only
    public void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// 🏎️ Inheritance - Car class inherits properties and behaviors of Vehicle class
class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        super(brand, model, year); // Calling superclass constructor
    }

    // Polymorphism - method overriding (same method, different behavior)
    @Override
    void startEngine() {
        System.out.println("Car engine started 🔥");
    }
}


