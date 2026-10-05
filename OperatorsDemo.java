public class OperatorsDemo {
    void add (int a, int b){
        int sum =a + b;
        System. out.println("Addition:" + sum);
    }

    int multiply(int a, int b){
        return a * b;
    }

public static void main(String[] args) {

    byte a = 50, b = 60;
    int result = a + b;
    System.out.println("Arithematic promotion Result:" + result);

    int x = 20, y = 15;
    System.out.println("x + y =" + (x + y));
    System.out.println("x - y =" + (x - y));
    System.out.println("x * y =" + (x * y));
    System.out.println("x / y =" + (x / y));
    System.out.println("x % y =" + (x % y));

    // Method calling
    OperatorsDemo obj = new OperatorsDemo();
    obj.add(12, 9);
    int product = obj.multiply(5, 4);
    System.out.println("multiplication: " + product);
}
}
