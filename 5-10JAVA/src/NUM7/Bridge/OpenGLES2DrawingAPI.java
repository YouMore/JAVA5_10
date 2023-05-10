package NUM7.Bridge;

/* Реализация рисования в OpenGL ES */
public class OpenGLES2DrawingAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("Drawing circle at (%f, %f) with radius %f using OpenGL ES 2.0\n", x, y, radius);
    }

    public void drawSquare(double x, double y, double side) {
        System.out.printf("Drawing square at (%f, %f) with side %f using OpenGL ES 2.0\n", x, y, side);
    }
}
