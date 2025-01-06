package src.srp_single_responsibility_principle;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        Email email = new Email();
        String emailAddress = "fulano.Silva@zmail.com";
        
        email.sendEmail(emailAddress, report.generateReport());
    }
}
