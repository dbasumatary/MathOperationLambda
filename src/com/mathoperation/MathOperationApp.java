package com.mathoperation;
//Performing Math operations using lambda expressions

//This is a Functional interface which permit one abstract method inside them
@FunctionalInterface
interface IMathFunction{
    int calculate(int a, int b);
    static void printMathOperationResult(int a,int b,String function, IMathFunction fObj){
        System.out.println("Result of math operation "+ function + " is: " +
                ""+ fObj.calculate(a,b));
    }
}

public class MathOperationApp {
    public static void main(String[] args) {

        //UC1.1  - Lambda expression for math operations for two parameters
        //It implements IMathFunction interface
        IMathFunction add = (a,b) -> a + b;
        IMathFunction subtract = (a,b) -> a - b;
        IMathFunction multiply = (a,b) -> a * b;
        IMathFunction divide = (int a,int b) -> {
                                                    if (b == 0){return 0;}
                                                    return a / b;
                                                };

        System.out.println("Addition is "+ add.calculate(8,7));
        System.out.println("Subtraction is "+ subtract.calculate(5,3));
        System.out.println("Multiplication is "+ multiply.calculate(3,9));
        System.out.println("Division is "+ divide.calculate(9,3));

        // UC1.2 -  Math operations using lambda function
        //Passing lambda expression as function parameter to print result using static function
        IMathFunction.printMathOperationResult(16,23,"addition",add);
        IMathFunction.printMathOperationResult(24,15,"subtraction",subtract);
        IMathFunction.printMathOperationResult(7,5,"multiplication",multiply);
        IMathFunction.printMathOperationResult(6,3,"division",divide);
    }
}
