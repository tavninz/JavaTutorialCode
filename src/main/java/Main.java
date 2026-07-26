public class Main {
    public static void main(String[] args) {
        // Overloading Method : Allow creates multiple method with the same name but differ
        // parameter
        A a1 = new A();
        a1.add();
        a1.add(2,4);
        a1.add(2,4,5);
    }
}


class A {
    public int a;
    public int b;

    // Method Same name but difference Parameter
    public int add(){
        return a + b;
    }
    public int add(int a,int b){
        return a * b;
    }
    public  int add(int a,int b, int c){
        return a + b * c;
    }
}
