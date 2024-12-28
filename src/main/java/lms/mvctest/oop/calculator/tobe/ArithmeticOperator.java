package lms.mvctest.oop.calculator.tobe;

import lms.mvctest.oop.calculator.domain.PositiveNumber;

public interface ArithmeticOperator {
    boolean supports(String operator);
    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}
