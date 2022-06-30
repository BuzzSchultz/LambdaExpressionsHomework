package ru.Homeworks.A_Batsanov.Calculator;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) ->
            y != 0 ? x / y : x < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
//    BinaryOperator<Integer> divide = (x, y) -> x / y; - ошибка выполнения данной строки кода
//    заключается в возникновении "ArithmeticException : / by zero" при значении аргумента (делителя)
//    "y = 0".
//    Для решения ошибки можно:
//    1. Оборачивать в main все вызовы calc.divide.aaply() и calc.println.accept("результат деления")
//    в блок try/catch и обрабатывать эту ошибку с выводом в консоль соответствующего
//    внятного сообщения;
//    2. Создать функциональный интерфейс альтернативу BinaryOperator, но типизировть его переменные
//    как String (для обеспечения возможности вывода в консоль внятных сообщений в случае
//    возникновения ошибок). Соответственно пришлось бы переписать код с учетом приведения
//    типов данных Integer -> String и обратно :0 ;
//    3. Изначально типизировать переменные функциональных интерфейсов как числа с плавающей запятой
//    (Float или Double).
//    И это было бы лучшим решением, как для избавления от нашей ошибки, так и для точности вычислений.
//    При делении на ноль получали бы результат POSITIVE_INFINITY или NEGATIVE_INFINITY,
//    а в случае деления "0/0" - NaN, и никаких ошибок;
//    4. Но в задании указано типизировать переменные функциональных интерфейсов как Integer, поэтому
//    мой код реализован так, как он реализован. С использованием минимального отрицательного
//    и максимального положительного значений Integer в качестве альтернативы -Infinity и Infinity
//    соответственно. Обидно, что не смог в этих условиях описать ситуацию деления "0/0",
//    т.к. Integer на этот случай не оставил мне шансов без привлечения чего-нибудь из
//    вышеописанных способов решения ошибки.
//    5. Возможно есть еще какое-то кунг-фу, но я пока с ним не знаком :)
//    Если пришлете на доработку - с радостью поэкспериментирую еще.
}
