package src.dip_dependency_inversion_principle;

public class Keyboard implements Device {
    @Override
    public void use() {
        System.out.println("Digitando...");
    }
}
