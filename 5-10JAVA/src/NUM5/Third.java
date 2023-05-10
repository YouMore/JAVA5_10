//Из методички
//через метод getInstance() с ленивой инициализацией:
package NUM5;

public class Third {
    private static Third instance;

    private Third() {}

    public static synchronized Third getInstance() {
        if (instance == null) {
            instance = new Third();
        }
        return instance;
    }
}
