package src.ocp_open_closed_principle;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("soma: "
                + calculator.calculate(50,50, "soma")
        );

        System.out.println("subtração: "
                + calculator.calculate(14,1, "subtração")
        );

        System.out.println("multiplicação: "
                + calculator.calculate(7,6, "multiplicação")
        );
    }
}
