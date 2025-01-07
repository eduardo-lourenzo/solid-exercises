package src.isp_interface_segregation_Principle;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Secretary secretary = new Secretary();

        System.out.print("Desenvolvedor: ");
        developer.program();

        System.out.print("Secretária   : ");
        secretary.attendingCustomer();
    }
}
