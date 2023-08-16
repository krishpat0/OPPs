/**
 * Bank
 */
public abstract class Bank {
    String name;

    abstract void readData();

    abstract void writeData();

    // no error
    void namePrint() {

    }
}

class Admin extends Bank {

    @Override
    void readData() {

    }

    @Override
    void writeData() {

    }

}

class Marketing extends Bank {

    @Override
    public void readData() {

    }

    @Override
    public void writeData() {

    }

}
