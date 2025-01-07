package src.isp_interface_segregation_Principle;

public class Secretary implements Attendant {
    @Override
    public void attendingCustomer() {
        System.out.println("Atendendo cliente...");
    }
}
