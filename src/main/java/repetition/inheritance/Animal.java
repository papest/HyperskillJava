package repetition.inheritance;

import java.util.Scanner;

public class Animal {
    private String name;
    private String type = "Animal";

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + '\n' + name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalName = scanner.nextLine();
        String dogName = scanner.nextLine();
        String breed = scanner.nextLine();

        Animal animal = new Animal(animalName);
        Dog dog = new Dog(dogName, breed);
        System.out.println(animal);
        System.out.println(dog);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name, "Dog");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                breed;
    }
}


