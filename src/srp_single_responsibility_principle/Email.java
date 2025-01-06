package src.srp_single_responsibility_principle;

public class Email {

    public void sendEmail(String recipientEmail, String message) {
        System.out.println("E-mail enviando!\n"
                + "Destinatário: " + recipientEmail + "\n"
                + "Mensagem    : " + message + "\n"
        );
    }
}
