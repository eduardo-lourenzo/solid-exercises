package src.lsp_liskov_substitution_principle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(8);
        Rectangle rectangle = new Rectangle(7, 6);

        System.out.println("Área do quadrado : " + square.getArea());
        System.out.println("Área do retângulo: " + rectangle.getArea());
    }
}
