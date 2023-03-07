package com.mathoperation;
//Performing Math operations using lambda expressions

//This is a Functional interface which permit one abstract method inside them
@FunctionalInterface
interface IMathFunction{
    int calculate(int a, int b);
}

public class MathOperationApp {
    public static void main(String[] args) {

        //Lambda expression for math operations for two parameters
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
    }
}