
class DadaG {
    void methodDadaG() {
        System.out.println("Method Dada G: Popatlal");
    }
}

class Dad extends DadaG {
    void methodDad() {
        System.out.println("Method Dad: Vishnubhai");
    }
}

class Kaka extends DadaG {
    void methodKaka() {
        System.out.println("Method Kaka: Kiran");
    }
}

class Son extends Dad {
    void methodSon() {
        System.out.println("Method Son: Krishna");
    }
}

// interface with extra

interface Family {
    void methodFamily();
}

class SonWithExtra extends Dad implements Family {
    @Override
    public void methodFamily() {
        System.out.println("Son Extra: Family ");
    }
}

// main
public class HybridInheri {
    public static void main(String[] args) {
        System.out.println("Hybrid Inheritance");

        Son me = new Son();
        me.methodDadaG();
        me.methodDad();
        me.methodSon();

        SonWithExtra meK = new SonWithExtra();
        meK.methodFamily();
        meK.methodDad();
        meK.methodDadaG();
    }
}