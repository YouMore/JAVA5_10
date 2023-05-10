package NUM7.Bridge;

/* Реализация рисования в OpenGL */
public class OpenGLDrawingAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("Drawing circle at (%f, %f) with radius %f using OpenGL\n", x, y, radius);
    }

    public void drawSquare(double x, double y, double side) {
        System.out.printf("Drawing square at (%f, %f) with side %f using OpenGL\n", x, y, side);
    }
}
