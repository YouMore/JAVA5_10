package NUM6.Factory;

public class DogFactory implements Factory{
    @Override
    public Animal animalFactory() {
        return new Dog();
    }
}
