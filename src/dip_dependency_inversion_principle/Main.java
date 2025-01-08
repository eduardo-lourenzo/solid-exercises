package src.dip_dependency_inversion_principle;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setDevices(new Keyboard());
        computer.setDevices(new Mouse());

        computer.useAllDevices();
    }
}
