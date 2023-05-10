package NUM6.AbstractFactory;

public class RussianFactory implements CountryFactory{
    @Override
    public Product createCar(){
        return new Car();
    }

    @Override
    public Product createFood(){
        return new Food();
    }
}
