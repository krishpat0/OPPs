public class Run {
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance");
        Son me = new Son();
        me.dadName();
        me.momName();
    }
}

// Multiple Inheritance
interface Dad {
    void dadName();

}

interface Mom {
    void momName();

}

class Son implements Dad, Mom {

    @Override
    public void dadName() {
        System.out.println("Vishnu");
    }

    @Override
    public void momName() {
        System.out.println("Bharti");
    }

}
