public class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.TestingChild();
    }
}


class Parents {
    // Access Modifiers (private, public, protected)
    public String publicVar = "Every One Can See.";
    protected String protectedVar = "See only Same package and same class or child class.";
    private String privateedVar = "See only current class or class itself.";

    // accessing by using Getter Setter Method on private member

    public String getPrivateedVar() {
        return privateedVar;
    }

    public void setPrivateedVar(String privateedVar) {
        this.privateedVar = privateedVar;
    }
}

class Child extends Parents {

    Child(){
        setPrivateedVar("Value Set from class child.");
    }
    public void TestingChild(){
        System.out.println("1. " + publicVar);
        System.out.println("2. " + protectedVar);
        // System.out.println(privatedVar); // Error can not access private member


        System.out.println("3. " + getPrivateedVar());
    }
}
