package src.srp_single_responsibility_principle;

public class Report {
    private final double total;

    public Report() {
        total = 987.12;
    }

    public String generateReport() {
        System.out.println("Gerando relatório financeiro...");
        return "Total do Relatório Financeiro: " + total;
    }
}
