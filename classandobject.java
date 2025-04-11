class Calculator{

    int a;
    public int add(int x, int y){
        int r = x + y;
        return r;
    }
}

public class classandobject {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);

        System.out.println("The sum of two numbers is: " + result);
    }

    public void Run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Run'");
    }

    public void running() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'running'");
    }
}
// Java is Object Oriented Programming
// Object:- Properties and Behaviours / object is created by JVM--->  the class file gets compiled into a bytecode---> goes to JVM---> Object gets created

// Class:- It's a blueprint of the things and properties we want to define in the Object