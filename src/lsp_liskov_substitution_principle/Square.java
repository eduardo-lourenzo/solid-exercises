package src.lsp_liskov_substitution_principle;

public class Square {
    Rectangle rectangle;

    public Square(int side) {
        rectangle = new Rectangle(side, side);
    }

    public void setSide(int side) {
        rectangle.setHeight(side);
        rectangle.setHeight(side);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}
