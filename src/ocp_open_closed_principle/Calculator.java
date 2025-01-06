package src.ocp_open_closed_principle;

public class Calculator {
    private Operation operation;

    public int calculate(int leftHandSide, int rightHandSide, String operator) {
        switch (operator) {
            case "soma" -> operation = new Add();
            case "subtração" -> operation = new Subtract();
            case "multiplicação" -> operation = new Multiply();
        }
        return operation.operate(leftHandSide, rightHandSide);
    }
}
