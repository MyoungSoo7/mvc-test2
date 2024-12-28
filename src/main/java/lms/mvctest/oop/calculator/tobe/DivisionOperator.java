package lms.mvctest.oop.calculator.tobe;

import lms.mvctest.oop.calculator.domain.PositiveNumber;

public class DivisionOperator implements ArithmeticOperator{
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() / operand2.toInt();
    }
}
