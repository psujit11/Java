/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author sujit
 */
// Superclass: Animal
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass: Mammal
class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        // Super is used to call the constructor of superclass from the subclass
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }
}

// Subclass: Bird
class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound");
    }
}

// Subclass: Fish
class Fish extends Animal {
    private String scaleColor;

    public Fish(String name, int age, String scaleColor) {
        super(name, age);
        this.scaleColor = scaleColor;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Fish sound");
    }
}

// Demonstrate the class hierarchy through a program


public class Superclass {
    
    public static void main(String[] args) {
        Mammal lion = new Mammal("Lion", 5, "Golden");
        Bird eagle = new Bird("Eagle", 3, true);
        Fish salmon = new Fish("Salmon", 1, "Silver");

        System.out.println("Details of the Lion:");
        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Fur Color: " + lion.getFurColor());
        lion.makeSound();

        System.out.println("\nDetails of the Eagle:");
        System.out.println("Name: " + eagle.getName());
        System.out.println("Age: " + eagle.getAge());
        System.out.println("Can Fly: " + eagle.canFly());
        eagle.makeSound();

        System.out.println("\nDetails of the Salmon:");
        System.out.println("Name: " + salmon.getName());
        System.out.println("Age: " + salmon.getAge());
        System.out.println("Scale Color: " + salmon.getScaleColor());
        salmon.makeSound();
    }
}

