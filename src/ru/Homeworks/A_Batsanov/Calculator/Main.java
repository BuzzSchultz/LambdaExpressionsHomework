package ru.Homeworks.A_Batsanov.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
        System.out.println(calc.isPositive.test(-5));
        System.out.println(calc.abs.apply(-5));
        System.out.println(calc.pow.apply(-5));
        System.out.println(calc.multiply.apply(a, b));
    }
}
