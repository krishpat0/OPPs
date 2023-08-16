// Parent interface 1
interface ParentInterface1 {
    void methodFromParent1();
}

// Parent interface 2
interface ParentInterface2 {
    void methodFromParent2();
}

// Child class implementing both interfaces
class ChildClass implements ParentInterface1, ParentInterface2 {
    @Override
    public void methodFromParent1() {
        // Implementation for method from ParentInterface1
        System.out.println("Dad");
    }

    @Override
    public void methodFromParent2() {
        // Implementation for method from ParentInterface2
        System.out.println("Mom");
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.methodFromParent1();
        child.methodFromParent2();
    }
}
