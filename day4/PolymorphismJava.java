package day4;

public class PolymorphismJava {

    public class Animal {
        public void sleep() {
            System.out.println("Animals are sleeping");
        }
    }

    public class Dog extends Animal {
        public void bark() {
            System.out.println("Dogs are barking");
        }

        public void sleep() {
            System.out.println("Dogs are sleeping");
        }
    }

    public static void main(String[] args) {
        PolymorphismJava polymorphismJava = new PolymorphismJava();
        Dog dog = polymorphismJava.new Dog();
        dog.sleep();
        dog.bark();

    }
    
}
