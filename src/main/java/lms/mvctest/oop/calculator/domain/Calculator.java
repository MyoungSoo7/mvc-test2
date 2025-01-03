package lms.mvctest.oop.calculator.domain;

import java.util.List;
import lms.mvctest.oop.calculator.tobe.ArithmeticOperator;

public class Calculator {
    private static final List<ArithmeticOperator> arithmeticOperators =
        List.of(new lms.mvctest.oop.calculator.tobe.AdditionOperator(), new lms.mvctest.oop.calculator.tobe.DivisionOperator());

    public static int calculate(PositiveNumber num1, String operator, PositiveNumber num2) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(num1, num2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
