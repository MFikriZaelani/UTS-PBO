// Interface
interface Animal {
    void eat();
    void makeSound();
}

// Encapsulation and Inheritance
class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name + " sedang makan");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sedang mengeong");
    }
}

// Polymorphism
class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name + " sedang makan");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sedang menggonggong");
    }
}

// Abstract class
abstract class AnimalWithChild {
    abstract void nurse();
}

// Inheritance
class CatWithChild extends AnimalWithChild {
    @Override
    void nurse() {
        System.out.println("Susy sedang menyusui anaknya");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        System.out.println("===== UTS Praktikum PBO =====");
        System.out.println("--------------------------------");
        System.out.println("Nama\t: Muhamad Fikri Zaelani");
        System.out.println("NIM\t: 1227050078");
        System.out.println("Kelas\t: IF-C");
        System.out.println("===============================\n");

        Cat garfield = new Cat("Garfield");
        Dog lucky = new Dog("Lucky");
        CatWithChild susy = new CatWithChild();

        garfield.eat();
        garfield.makeSound();

        lucky.eat();
        lucky.makeSound();

        susy.nurse();
    }
}
