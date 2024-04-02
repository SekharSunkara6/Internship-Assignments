class Parent {
    void display() {
        System.out.println("Display method of the Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Display method of the Child class");
    }

    void display(String message) {
        System.out.println("Overloaded method: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();
        child.display("Hello from Child");
    }
}

Output:

Display method of the Parent class
Display method of the Child class
Overloaded method: Hello from Child
