package src.ocp_open_closed_principle;

public class Subtract implements Operation {
    @Override
    public int operate(int leftHandSide, int rightHandSide) {
        return leftHandSide - rightHandSide;
    }
}
