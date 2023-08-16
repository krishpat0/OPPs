/**
 * MethodOverridng
 */
interface MethodOverridng {

    void printName();
}

class Dad implements MethodOverridng {
    @Override
    public void printName() {
        // TODO Auto-generated method stub
        System.out.println("Vishnu");

    }
}

class Mom implements MethodOverridng {
    @Override
    public void printName() {
        // TODO Auto-generated method stub
        System.out.println("Bharti");

    }
}