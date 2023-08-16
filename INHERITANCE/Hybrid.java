// Grandparent class
class Grandparent {
    void grandparentMethod() {
        System.out.println("Grandparent's method");
    }
}

// Parent class implementing grandparent's methods
class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("Parent's method");
    }
}

// Another parent class implementing different methods
class AnotherParent {
    void anotherParentMethod() {
        System.out.println("Another Parent's method");
    }
}

// Child class inheriting from both Parent and AnotherParent
class Child extends Parent {
    void childMethod() {
        System.out.println("Child's method");
    }
}

// Interface with some additional methods
interface ExtraInterface {
    void extraMethod();
}

// Child class implementing ExtraInterface
class ChildWithExtra extends Parent implements ExtraInterface {
    @Override
    public void extraMethod() {
        System.out.println("Child's extra method");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Child child = new Child();
        child.grandparentMethod();
        child.parentMethod();
        child.childMethod();

        ChildWithExtra childWithExtra = new ChildWithExtra();
        childWithExtra.grandparentMethod();
        childWithExtra.parentMethod();
        childWithExtra.extraMethod();
    }
}
