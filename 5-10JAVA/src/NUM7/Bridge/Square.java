package NUM7.Bridge;

/* Конкретная реализация квадрата */
public class Square extends Shape {
    private double x, y, side;

    public Square(double x, double y, double side, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public void draw() {
        drawingAPI.drawSquare(x, y, side);
    }
}
