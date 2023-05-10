package NUM6;

import NUM6.AbstractFactory.CountryFactory;
import NUM6.AbstractFactory.GermanFactory;
import NUM6.AbstractFactory.Product;
import NUM6.AbstractFactory.RussianFactory;
import NUM6.Builder.Builder;
import NUM6.Builder.Director;
import NUM6.Builder.Tower;
import NUM6.Builder.TowerBuilder;
import NUM6.Factory.Animal;
import NUM6.Factory.CatFactory;
import NUM6.Factory.DogFactory;
import NUM6.Factory.Factory;
import NUM6.Prototype.Triangle;
import NUM6.Prototype.Shape;


public class Main {
    public static void main(String[] args) {
        factory();
        abstractFactory();
        builder();
        prototype();
    }

//Паттерн «Строитель» – разделяет создание объекта на отдельные
//шаги, а также позволяет использовать один и тот же код создания для
//получения различных представлений

    public static void builder() {
        System.out.println("================= Builder pattern =================");

        Builder builder = new TowerBuilder();
        Director director = new Director(builder);

        director.buildEiffel();
        Tower tower1 = builder.getResult();
        System.out.println(tower1);

        director.buildOstankino();
        Tower tower2 = builder.getResult();
        System.out.println(tower2);
    }

//Паттерн «Фабричный метод» – определяет интерфейс создания
//объектов, позволяя подклассам менять тип создаваемых объектов ()

    public static void factory() {
        System.out.println("================= Factory pattern =================");
        Factory[] enemiesMakers = {new CatFactory(), new DogFactory()};
        for (Factory factory : enemiesMakers) {
            Animal animal = factory.animalFactory();
            animal.SaySomething();
        }
    }

//Паттерн «Абстрактная фабрика» – позволяет создавать семейства
//определенных объектов. Фактически является расширением
//паттерна «Фабричный метод».

    public static void abstractFactory() {
        System.out.println("================= Abstract factory pattern =================");
        CountryFactory[] carFactories = {new RussianFactory(), new GermanFactory()};
        for (CountryFactory factory : carFactories) {
            Product food = factory.createFood();
            Product clothes = factory.createCar();
            food.printProduct();
            clothes.printProduct();
        }
    }

//Паттерн «Прототип» – позволяет копировать объекты без обращения
//к приватному состоянию извне

    public static void prototype() {
        System.out.println("================= Prototype pattern =================");
        Shape triangle1 = new Triangle(10, 20, "blue");

        System.out.println("---- True triangle ----");
        System.out.println(triangle1.getColor());
        System.out.println(triangle1.getX());
        System.out.println(triangle1.getY());

        Shape triangle2 = triangle1.clone();

        System.out.println("---- Clone triangle ----");
        System.out.println(triangle2.getColor());
        System.out.println(triangle2.getX());
        System.out.println(triangle2.getY());
    }
}
