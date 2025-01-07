package src.lsp_liskov_substitution_principle;

public class Square {
    private final Rectangle rectangle;

    public Square(int side) {
        rectangle = new Rectangle(side, side);
    }

    public void setSide(int side) {
        rectangle.setHeight(side);
        rectangle.setWidth(side);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}
