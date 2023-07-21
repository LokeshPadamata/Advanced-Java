package org.example;


class MathOperations{
    public int add(int a, int b){
        return a+b;
    }
    public int multiply(int x,int y){
        return x*y;
    }
    public int divide(int x,int y){
        return x/y;
    }
}
public class Main {
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
        mathOperations.add(5,5);
        mathOperations.multiply(3,5);
        mathOperations.divide(4,5);
    }
}