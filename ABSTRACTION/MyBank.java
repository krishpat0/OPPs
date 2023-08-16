/**
 * MyBank
 */
interface MyBank {

    void write();

}

/**
 * InnerMyBank
 */
class Sbiread implements MyBank {

    @Override
    public void write() {
        System.out.println("Interface 100% Achive Abstraction");

    }

}