//class AdditionThread extends Thread {
//    private double a, b;
//
//    public AdditionThread(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public void run() {
//        double result = a + b;
//        System.out.println("Addition: " + a + " + " + b + " = " + result);
//    }
//}
class AdditionThread implements Runnable {
    private double a, b;

    public AdditionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        double result = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + result);
    }
}

class SubtractionThread extends Thread {
    private double a, b;

    public SubtractionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        double result = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + result);
    }
}

class MultiplicationThread extends Thread {
    private double a, b;

    public MultiplicationThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        double result = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + result);
    }
}

class DivisionThread extends Thread {
    private double a, b;

    public DivisionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        if (b != 0) {
            double result = a / b;
            System.out.println("Division: " + a + " / " + b + " = " + result);
        } else {
            System.out.println("Division by zero is not allowed!");
        }
    }
}
class Main {

    public static void main(String[] args) {
        double num1 = 10, num2 = 5;

        // Create and start threads for each operation
//        Runnable additionThread = new AdditionThread(num1, num2);
        Thread additionThread = new Thread(new AdditionThread(num1, num2)) ;
        Thread subtractionThread = new SubtractionThread(num1, num2);
        Thread multiplicationThread = new MultiplicationThread(num1, num2);
        Thread divisionThread = new DivisionThread(num1, num2);

        additionThread.start();
        subtractionThread.start();
        multiplicationThread.start();
        divisionThread.start();


        try {
            additionThread.join();
            subtractionThread.join();
            multiplicationThread.join();
            divisionThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("All operations are completed.");
    }
}

